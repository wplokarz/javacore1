package org.example;

public class Task3 {
    static class Person {
        String name;
        int age;
    }

    public static class MakingChanges {
        public static void changeIdentities(Person p1, Person p2) {
            Person temporaryClass = new Person();
            temporaryClass.name = p2.name;
            temporaryClass.age = p2.age;
            p2.name = p1.name;
            p2.age = p1.age;
            p1.name = temporaryClass.name;
            p1.age = temporaryClass.age;
        }
    }

    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        firstPerson.name = "James";
        firstPerson.age = 30;
        secondPerson.name = "Carls";
        secondPerson.age = 20;
        MakingChanges.changeIdentities(firstPerson, secondPerson);
        System.out.println(firstPerson.name);
        System.out.println(firstPerson.age);
        System.out.println(secondPerson.name);
        System.out.println(secondPerson.age);
    }
}
