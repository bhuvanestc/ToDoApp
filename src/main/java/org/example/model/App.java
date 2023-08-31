package org.example.model;

import org.example.model.Person;
import org.example.data.dao.AppUserDAOCollection;
import org.example.data.dao.TodoItemTaskDAOCollection;
import org.example.data.dao.TodoItemDAOCollection;
import org.example.data.dao.PersonDAOCollection;
import org.example.data.dao.PersonDAO;
import org.example.data.dao.TodoItemTaskDAO;
import org.example.data.dao.TodoItemDAO;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Person bhuvana = new Person(1,"Bhuavna","Chandran","bhuva@gmail.com");
        Person jamuna = new Person(1,"jamunana","Chandran","jamu@gmail.com");
        Person janavi = new Person(2,"janavi","indran","janaa@gmail.com");
        TodoItem T1= new TodoItem(1,"Writing","Homework", LocalDate.of(2023,9,02),false,janavi);
        TodoItem T2= new TodoItem(1,"Reading","novel reading", LocalDate.of(2023,8,31),true,janavi);
        TodoItemTask t1 =new TodoItemTask(1,true,T1,bhuvana);
        TodoItemTask t2 =new TodoItemTask(1,true,T2,janavi);



    }
}
