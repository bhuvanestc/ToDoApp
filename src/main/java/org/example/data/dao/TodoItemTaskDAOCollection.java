package org.example.data.dao;

import org.example.model.Person;
import org.example.model.TodoItem;
import org.example.model.TodoItemTask;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO{
    private Collection<TodoItemTask> todoItemTask;
    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        Person p2=new Person(2,"guru","Chand","chand@gmail.com");
        TodoItem T1 = new TodoItem(1,"Gardening","Planting trees", LocalDate.of(2023,8,31),false,p2) ;
        TodoItemTask t1 = new TodoItemTask(1,true,T1,p2);
        this.todoItemTask.add(t1);
        return t1;
    }

    @Override
    public TodoItemTask findById(TodoItemTask id) {
        for(TodoItemTask t1: todoItemTask)
        {
            if (t1.getId() == id.getId()) {
                return t1;
            }

        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return new ArrayList<>(todoItemTask);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(TodoItemTask status) {
        List<TodoItemTask> result = new ArrayList<>();

        for (TodoItemTask task : todoItemTask) {
            if (task.isAssigned() == status.isAssigned()) {
                result.add(task); // Add tasks with matching assigned status to the result list
            }
        }

        return result;
    }
    @Override
    public Collection<TodoItemTask> findByPersonId(TodoItemTask personId)
    {
        List<TodoItemTask> result = new ArrayList<>();

        for (TodoItemTask task : todoItemTask) {
            if (task.getId() == personId.getId()) {
                result.add(task);
            }
        }

        return result;
    }
    @Override
    public void remove(TodoItemTask id) {
        Iterator<TodoItemTask> iterator = todoItemTask.iterator();

        while (iterator.hasNext()) {
            TodoItemTask item = iterator.next();
            if (item.getId() == id.getId()) {
                iterator.remove();
            }
        }

    }
}
