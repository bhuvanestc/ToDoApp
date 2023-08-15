package org.example;

public class TodoItemTask {
    private int id;
    private Boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, Boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;

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
        this.todoItem = todoItem;
    }
    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee)
    {
        this.assignee = assignee;
    }

    public String getSummary(){
        return this.getSummary();
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
