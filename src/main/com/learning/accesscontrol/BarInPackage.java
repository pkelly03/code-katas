package com.learning.accesscontrol;

public class BarInPackage extends Foo {

    public static void main(String[] args) {
        BarInPackage barInPackage = new BarInPackage();
        System.out.println(barInPackage.getValue());
    }

}
