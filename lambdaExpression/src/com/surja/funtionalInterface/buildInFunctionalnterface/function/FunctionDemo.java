package com.surja.funtionalInterface.buildInFunctionalnterface.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // creating a function that will register a person as student
        Function<Person, Student> regStudent = new Function<Person, Student>() {
            @Override
            public Student apply(Person person) {

                return new Student(person.name,person.age,12361468L);
            }
        };

        // creating a function that will provide an id card for student

        Function<Student, IDCard> issueIDCard = new Function<Student, IDCard>() {
            @Override
            public IDCard apply(Student student) {
                return new IDCard(student.name.substring(0,5)+student.rollNo);
            }
        };


        Person person = new Person("Rahul", 25);
        //Student student =  regStudent.apply(person);
        //System.out.println(student);

        // creating id card for student
       // System.out.println(issueIDCard.apply(student));

        // directly creating id card
        System.out.println(regStudent.andThen(issueIDCard).apply(person));

    }
}
