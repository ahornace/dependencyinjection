package cz.cuni.mff;

import cz.cuni.mff.singleton.MyComplexComplexSingleton;
import cz.cuni.mff.singleton.MyComplexSingleton;
import cz.cuni.mff.singleton.MySingleton;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class InjectionProcessorTest {

    @Test
    public void simpleTest() {
        List<Object> singletons = InjectionProcessor.instantiateSingletons("cz.cuni.mff.singleton");

        assertThat(singletons, containsInAnyOrder(Set.of(Matchers.instanceOf(MySingleton.class),
                Matchers.instanceOf(MyComplexSingleton.class), Matchers.instanceOf(MyComplexComplexSingleton.class))));

        MyComplexComplexSingleton s = getObj(singletons, MyComplexComplexSingleton.class);
        assertThat(s.getMyComplexSingleton(), Matchers.instanceOf(MyComplexSingleton.class));
        assertThat(s.getMyComplexSingleton().getMySingleton(), Matchers.instanceOf(MySingleton.class));
    }

    @SuppressWarnings("unchecked")
    private <T> T getObj(final List<Object> l, final Class<T> cl) {
        for (Object o : l) {
            if (cl.isInstance(o)) {
                return (T) o;
            }
        }
        throw new IllegalArgumentException("Could not find instance of " + cl);
    }

}