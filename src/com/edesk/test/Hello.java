package com.edesk.test;

public class Hello {

    public static void main(String[] args) {
        Person person = new Person("SAMEERA", 27);
        String user = person.getPersonName();
        int age = person.getPersonAge();

        System.out.println("User : " + user + " he is " + age + " old");
    }
}
