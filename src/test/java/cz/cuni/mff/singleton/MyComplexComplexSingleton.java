package cz.cuni.mff.singleton;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyComplexComplexSingleton {

    @Inject
    private MyComplexSingleton myComplexSingleton;

    public MyComplexSingleton getMyComplexSingleton() {
        return myComplexSingleton;
    }
}
