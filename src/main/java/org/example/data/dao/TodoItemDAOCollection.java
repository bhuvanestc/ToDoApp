package org.example.data.dao;
import org.example.model.Person;
import org.example.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TodoItemDAOCollection implements TodoItemDAO{
    private Collection<TodoItem> todoItem;

    @Override
    public TodoItem persist(TodoItem todoItem) {

        {
            Person p1=new Person(1,"charu","sivan","cha@gmail.com");
            TodoItem T1 = new TodoItem(1,"Gardening","Planting trees",
                    LocalDate.of(2023,8,31),false,p1) ;
            this.todoItem.add(T1);
            return T1;
        }
    }

    @Override
    public TodoItem findById(TodoItem id) {
        for(TodoItem t1: todoItem)
        {
         if (t1.getId() == id.getId()) {
                return t1;
            }

         }
        return null;

    }
    @Override
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(todoItem);
    }
    @Override
    public Collection<TodoItem> findAllByDoneStatus(TodoItem done)
    {
        List<TodoItem> result = new ArrayList<>();

        for (TodoItem item : todoItem) {
            if (item.equals(done)) {
                result.add(item); // Add items with matching done status to the result list
            }
        }

        return result;
    }
    @Override
    public Collection<TodoItem> findByTitleContains(TodoItem title) {
        List<TodoItem> result = new ArrayList<>();

        for (TodoItem item : todoItem) {
            if (item.getTitle().contains() {
                result.add(item); // Add items with matching done status to the result list
            }
        }

        return result;
    }

    @Override
    public Collection<TodoItem> findByPersonId(TodoItem personId) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(TodoItem date) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(TodoItem date) {
        return null;
    }

    @Override
    public void remove(TodoItem id) {

    }
}
