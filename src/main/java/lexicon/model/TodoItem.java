package lexicon.model;

import lexicon.model.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class TodoItem {

    // ******
    // Fields
    // ******

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    // **************
    // Constructor(s)
    // **************


    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        setTitle(title);
        this.taskDescription = taskDescription;
        setDeadLine(deadLine);
        this.done = done;
        this.creator = creator;
    }

    // *******
    // Methods
    // *******

    // ******************************************
    // Overridden methods from 'java.lang.Object'
    // ******************************************

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadLine, done, creator);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        TodoItem todoItem = (TodoItem) obj;
        return Objects.equals(this.id, todoItem.id) &&
                Objects.equals(this.title, todoItem.title) &&
                Objects.equals(this.taskDescription, todoItem.taskDescription ) &&
                Objects.equals(this.deadLine, todoItem.deadLine) &&
                Objects.equals(this.done, todoItem.done) &&
                Objects.equals(this.creator, todoItem.creator);
    }

    @Override
    public String toString() {
        return "TodoItem { id: " + getId() +
                ", title: " + getTitle() +
                ", task description: " + getTaskDescription() +
                ", deadline: " + getDeadLine() +
                ", is overdue? " + isOverdue() +
                ", done: " + isDone() + " }"; // Person object excluded
    }

    public boolean isOverdue() {
        return deadLine.isBefore(LocalDateTime.now().toLocalDate());
    }

    // *****************
    // Getters & Setters
    // *****************

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) throw new IllegalArgumentException("Title name cannot be null");
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
        if (deadLine == null) throw new IllegalArgumentException("Deadline name cannot be null");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
