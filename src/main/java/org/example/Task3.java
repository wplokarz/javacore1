package org.example;

public class Task3 {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.name = "James";
        firstPerson.age = 30;
        secondPerson.name = "Carls";
        secondPerson.age = 20;

        MakingChanges.changePersonIdentities(firstPerson, secondPerson);
        System.out.println(firstPerson.name);
        System.out.println(firstPerson.age);
        System.out.println(secondPerson.name);
        System.out.println(secondPerson.age);
    }

    static class Person {
        String name;
        int age;
    }

    public static class MakingChanges {
        // method takes two Person objects and switch their properties, namely name and age
        public static void changePersonIdentities(Person person1, Person person2) {
            Person bufferPerson = new Person();
            bufferPerson.name = person2.name;
            bufferPerson.age = person2.age;
            person2.name = person1.name;
            person2.age = person1.age;
            person1.name = bufferPerson.name;
            person1.age = bufferPerson.age;
        }
    }
}
