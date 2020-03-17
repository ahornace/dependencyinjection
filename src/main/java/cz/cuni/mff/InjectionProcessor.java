package cz.cuni.mff;

import org.reflections.Reflections;
import org.reflections.scanners.TypeAnnotationsScanner;

import javax.inject.Singleton;
import java.util.List;
import java.util.Set;

public class InjectionProcessor {

    public static List<Object> instantiateSingletons(final String packageName) {
        Reflections reflections = new Reflections(packageName, new TypeAnnotationsScanner());
        Set<Class<?>> cl = reflections.getTypesAnnotatedWith(Singleton.class, true);

        throw new UnsupportedOperationException("Not implemented yet");
    }

}
