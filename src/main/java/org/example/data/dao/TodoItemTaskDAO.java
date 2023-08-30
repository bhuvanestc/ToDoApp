package org.example.data.dao;

import org.example.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {
    public TodoItemTask persist(TodoItemTask todoItemTask);
    public TodoItemTask findById(TodoItemTask id);
    public Collection<TodoItemTask> findAll();
    public Collection<TodoItemTask> findByAssignedStatus(TodoItemTask status);
    public Collection<TodoItemTask> findByPersonId(TodoItemTask personId);
    public void remove(TodoItemTask id);
}
