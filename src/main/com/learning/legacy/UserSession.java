package com.learning.legacy;

public class UserSession {

    private String prop1;
    private String prop2;
    private com.learning.legacy.User loggedInUser;

    private final static UserSession INSTANCE = new UserSession();

    private UserSession() {}
    public static UserSession getInstance() {
        System.out.println("THIS IS A REALLY EXPENSIVE OBJECT THAT I CAN'T MOCK");
        throw new RuntimeException("Tooooooo Expensive - should not be hitting this with the unit test");
    }
    public UserSession(Builder builder) {
        prop1 = builder.prop1;
        prop2 = builder.prop2;
    }

    public static class Builder {

        private String prop1;
        private String prop2;
        public Builder withProp1(String prop1) {
            this.prop1 = prop1;
            return this;
        }

        public Builder withProp2(String prop2) {
            this.prop2 = prop2;
            return this;
        }

        public UserSession build() {
            return new UserSession(this);
        }

    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public static void main(String[] args) {
        UserSession testBean = new Builder().withProp1("prop1---").withProp2("prop2---").build();
        System.out.println("Prop1 : " + testBean.getProp1());
        System.out.println("Prop2 : " + testBean.getProp2());
    }

    public com.learning.legacy.User getLoggedInUser() {
        return loggedInUser;
    }
}
