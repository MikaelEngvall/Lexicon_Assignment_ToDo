package lexicon.model;

import lexicon.model.Person;
import lexicon.model.TodoItem;

import java.util.Objects;

public class TodoItemTask {

    // ******
    // Fields
    // ******


    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // **************
    // Constructor(s)
    // **************


    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    // *******
    // Methods
    // *******

    // ******************************************
    // Overridden methods from 'java.lang.Object'
    // ******************************************

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem, assignee);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj ) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        TodoItemTask todoItemTask = (TodoItemTask) obj;
        return Objects.equals(this.id, todoItemTask.id) &&
                Objects.equals(this.assigned, todoItemTask.assigned) &&
                Objects.equals(this.todoItem, todoItemTask.todoItem) &&
                Objects.equals(this.assignee, todoItemTask.assignee);
    }

    @Override
    public String toString() {
        return "TodoItemTask { id: " + getId() +
                ", todo item: " + getTodoItem().toString() + " }"; // Person object excluded
    }

    // *****************
    // Getters & Setters
    // *****************


    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned; // is automatically false if null
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

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
