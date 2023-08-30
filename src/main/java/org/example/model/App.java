package org.example.model;

import org.example.model.Person;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Person bhuvana = new Person(1,"Bhuavna","Chandran","bhuva@gmail.com");
        Person janavi = new Person(2,"janavi","indran","janaa@gmail.com");
        TodoItem T1= new TodoItem(1,"Writing","Homework", LocalDate.of(2023,9,02),false,janavi);
        TodoItemTask t1 =new TodoItemTask(1,true,T1,bhuvana);

    }
}
