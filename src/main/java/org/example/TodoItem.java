package org.example;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    public String title;
    public String taskDescription;
    public LocalDate deadLine;
    public Boolean done;
    public Person creator;




    public TodoItem( int id,String title, String taskDescription, LocalDate deadLine,Boolean done) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("Title cannot be null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {

        if (deadLine == null) throw new IllegalArgumentException("Deadline cannot be null");
        this.deadLine = deadLine;
    }

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public Boolean isOverdue() {
        return LocalDate.now().isAfter(this.deadLine);
    }

    public String getSummary()
    {
        return this.toString();
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", creator=" + creator +
                '}';
    }


}
