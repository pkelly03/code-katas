package com.learning;

import com.learning.legacy.TestingObjectsThatUseSingletons;
import org.junit.Test;

/**
 */
public class TestingSingletonsWithASeamTest {

    @Test
    public void hardToTestAClassWithASingleton() {
        TestingObjectsThatUseSingletons objectWithSingleton = new SeamTest();
        objectWithSingleton.methodToTestWithSingleton();
    }

    private class SeamTest extends TestingObjectsThatUseSingletons {

        @Override
        public com.learning.legacy.User getBeanSeam() {
            return new com.learning.legacy.User("paul.kelly");    //To change body of overridden methods use File | Settings | File Templates.
        }
    }


}
