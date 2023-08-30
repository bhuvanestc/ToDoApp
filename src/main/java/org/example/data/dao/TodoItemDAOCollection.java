package org.example.data.dao;
import org.example.model.Person;
import org.example.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TodoItemDAOCollection implements TodoItemDAO{
    private Collection<TodoItem> todoItem;

    @Override
    public TodoItem persist(TodoItem todoItem) {


            Person p1=new Person(1,"charu","sivan","cha@gmail.com");
            TodoItem T1 = new TodoItem(1,"Gardening","Planting trees",
                    LocalDate.of(2023,8,31),false,p1) ;
            this.todoItem.add(T1);
            return T1;

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
                result.add(item);
            }
        }

        return result;
    }
    @Override
    public Collection<TodoItem> findByTitleContains(TodoItem title) {
        List<TodoItem> result = new ArrayList<>();

        for (TodoItem item : todoItem) {
            if (item.getTitle().contains(item.title))
            {
                result.add(item);
            }
        }

        return result;
    }

    @Override
    public Collection<TodoItem> findByPersonId(TodoItem personId) {
        for (TodoItem p1 : todoItem) {
            if (p1.getId() == personId.getId()) {
                return (Collection<TodoItem>) p1;
            }
        }
        return null;
    }
    @Override
    public Collection<TodoItem> findByDeadlineBefore(TodoItem date) {
        List<TodoItem> result = new ArrayList<>();

        for (TodoItem item : todoItem) {
            if (item.getDeadLine() != null && item.getDeadLine().isBefore(date.getDeadLine())) {
                result.add(item);
            }
        }

        return result;
    }
    @Override
    public Collection<TodoItem> findByDeadlineAfter(TodoItem date) {
        List<TodoItem> result = new ArrayList<>();

        for (TodoItem item : todoItem) {
            if (item.getDeadLine() != null && item.getDeadLine().isAfter(date.getDeadLine())) {
                result.add(item); // Add items with deadlines after the given date to the result list
            }
        }

        return result;
    }

    @Override
    public void remove(TodoItem id) {
        Iterator<TodoItem> iterator = todoItem.iterator();

        while (iterator.hasNext()) {
            TodoItem item = iterator.next();
            if (item.getId() == id.getId()) {
                iterator.remove();
            }
        }
    }
}
