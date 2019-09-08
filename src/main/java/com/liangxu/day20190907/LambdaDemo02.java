package com.liangxu.day20190907;

public class LambdaDemo02 {

    class Person {
        String firstName;
        String lastName;

        Person() {
        }

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }


    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }


    PersonFactory<Person> personFactory = Person::new;
    Person person = personFactory.create("Peter", "Parker");

    
}
