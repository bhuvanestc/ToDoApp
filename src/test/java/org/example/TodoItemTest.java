package org.example;

import org.example.model.Person;
import org.example.model.TodoItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    void setTitle() {
        Person person=new Person(1,"Bhuvana","Chandran","bhu@gmail.com");
        TodoItem task = new TodoItem(1,"Gardening","planting tree", LocalDate.now(),false,person);
        assertEquals("Gardening",task.getTitle());
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            task.setTitle(null);
        });
        Assertions.assertEquals("Title cannot be null", thrown.getMessage());
    }
    @Test
    void setDeadLine() {
        Person person=new Person(1,"Bhuvana","Chandran","bhu@gmail.com");
        TodoItem task = new TodoItem(1,"Gardening","planting tree", LocalDate.now(),false,person);
        assertEquals(LocalDate.now(),task.getDeadLine());
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            task.setDeadLine(null);
        });
        Assertions.assertEquals("Deadline cannot be null", thrown.getMessage());
    }

    @Test
    void isOverdue() {
        Person person=new Person(1,"Bhuvana","Chandran","bhu@gmail.com");
        TodoItem task = new TodoItem(1,"Gardening","planting tree",LocalDate.of(2023,8,29),true,person);
        task.setDeadLine(LocalDate.now().plusDays(0));
        assertFalse(task.isOverdue());

        task.setDeadLine(LocalDate.now().minusDays(2));
        assertTrue(task.isOverdue());
    }
}