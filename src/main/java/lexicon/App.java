package lexicon;

import lexicon.model.Person;
import lexicon.model.TodoItem;
import lexicon.model.TodoItemTask;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {

        // Part 1
        Person person = new Person(12, "Mikael", "Engvall", "mikael.engvall.me@gmail.com");
        TodoItem todoItem = new TodoItem(4, "Finish assignment", "Refer to previous lectures and reference material", LocalDate.of(2023, 8, 25), false, person);
        TodoItemTask todoItemTask = new TodoItemTask(2, true, todoItem, person);

        System.out.println(person);
        System.out.println(todoItem);
        System.out.println(todoItemTask);

        // Part 2
        System.out.println(person);
    }
}
