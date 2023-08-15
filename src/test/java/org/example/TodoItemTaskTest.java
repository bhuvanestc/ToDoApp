package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskTest {

    @Test
    void isAssigned() {
        Person Bhuvana = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com");
        TodoItem task = new TodoItem(1,"Gardening","planting tree", LocalDate.now(),true);
        TodoItemTask taskdesc = new TodoItemTask(1, false,task,Bhuvana );
        taskdesc.setAssignee(null);
        assertFalse(taskdesc.isAssigned());
    }

    @Test
    void setTodoItem() {
        Person Bhuvana = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com");
        TodoItem task = new TodoItem(1,"Gardening","planting tree", LocalDate.now(),true);
        TodoItemTask taskdesc = new TodoItemTask(1, false,task,Bhuvana );
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            taskdesc.setTodoItem(null);
        });
        Assertions.assertEquals("Todoitem cannot be null", thrown.getMessage());
    }
}