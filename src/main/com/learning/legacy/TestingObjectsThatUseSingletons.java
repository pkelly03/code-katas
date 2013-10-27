package com.learning.legacy;

/**
 */
public class TestingObjectsThatUseSingletons implements TestingObjectsWithSeam {

    public void methodToTestWithSingleton() {

        com.learning.legacy.User beanSeam = getBeanSeam();
        String username = beanSeam.getUsername();

        System.out.println("prop1 = " + username);
    }

    public com.learning.legacy.User getBeanSeam() {
        return UserSession.getInstance().getLoggedInUser();
    }

}
