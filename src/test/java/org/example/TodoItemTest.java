package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    void setTitle() {
        TodoItem task = new TodoItem(1,"Gardening","planting tree", LocalDate.now(),false);
        assertEquals("Gardening",task.getTitle());
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            task.setTitle(null);
        });
        Assertions.assertEquals("Title cannot be null", thrown.getMessage());
    }
    @Test
    void setDeadLine() {
        TodoItem task = new TodoItem(1,"Gardening","planting tree", LocalDate.now(),false);
        assertEquals(LocalDate.now(),task.getDeadLine());
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            task.setDeadLine(null);
        });
        Assertions.assertEquals("Deadline cannot be null", thrown.getMessage());
    }

    @Test
    void isOverdue() {

        TodoItem task = new TodoItem(1,"Gardening","planting tree",LocalDate.now(),true);
        task.setDeadLine(LocalDate.now().plusDays(1));
        assertFalse(task.isOverdue());

        task.setDeadLine(LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }
}