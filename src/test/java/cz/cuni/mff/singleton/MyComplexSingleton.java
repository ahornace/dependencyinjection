package cz.cuni.mff.singleton;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyComplexSingleton {

    @Inject
    private MySingleton mySingleton;

    public MySingleton getMySingleton() {
        return mySingleton;
    }
}
