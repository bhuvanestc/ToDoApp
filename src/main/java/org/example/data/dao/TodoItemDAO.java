package org.example.data.dao;

import org.example.model.TodoItem;

import java.util.Collection;

public interface TodoItemDAO {
    public TodoItem persist(TodoItem todoItem);
    public TodoItem findById(TodoItem id);
    public Collection<TodoItem> findAll();
    public Collection<TodoItem> findAllByDoneStatus(TodoItem done);
    public Collection<TodoItem> findByTitleContains(TodoItem title);
    public Collection<TodoItem> findByPersonId(TodoItem personId);
    public Collection<TodoItem> findByDeadlineBefore(TodoItem date);
    public Collection<TodoItem> findByDeadlineAfter(TodoItem date);
    public void remove (TodoItem id);
}
