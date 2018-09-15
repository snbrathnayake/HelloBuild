package com.edesk.test;

public class Person {

    private String name;
    private int age;

    public Person(String _name , int _age) {
        this.name = _name;
        this.age = _age;
    }

    public String getPersonName() {
        return this.name;
    }

    public int getPersonAge() {
        return this.age;
    }
}
