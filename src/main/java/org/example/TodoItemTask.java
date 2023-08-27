package org.example;

import java.util.Objects;

public class TodoItemTask {
    private int id;
    private Boolean assigned;
    private TodoItem todoItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id && Objects.equals(assigned, that.assigned) && Objects.equals(todoItem, that.todoItem) && Objects.equals(assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem, assignee);
    }

    private Person assignee;

    public TodoItemTask(int id, Boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        setTodoItem(todoItem);
        setAssignee(assignee);

    }



    public int getId() {
        return id;
    }

    public Boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(Boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("Todoitem cannot be null");
        this.todoItem = todoItem;
    }
    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee){
    this.assignee = assignee;
    }



    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                ", assignee=" + assignee +
                '}';
    }






}
