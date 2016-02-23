package com.initialization.blocks;

class MyClass {
    public String var = "base";

    public void printVar() {
        System.out.println(var);
    }
}

class MyDerivedClass extends MyClass {
    public String var = "derived";

    public void printVar() {
        System.out.println(var);
    }
}

public class Binding {
    public static void main(String[] args) {
        MyClass base = new MyClass();
        MyClass derived = new MyDerivedClass();

        System.out.println(base.var);
        System.out.println(derived.var);
        base.printVar();
        derived.printVar();
    }
}
