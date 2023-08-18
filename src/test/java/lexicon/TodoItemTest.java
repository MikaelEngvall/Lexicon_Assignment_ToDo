package lexicon;

import lexicon.model.Person;
import lexicon.model.TodoItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    @DisplayName("The title of the TodoItemTest object should not be equal to null")
    public void todoitemThrowsIfTitleIsNull() {
        Person person = new Person(1, "Mikael", "Engvall", "mikael.engvall.me@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, null, "description", LocalDate.now(), true, person));
    }
    @Test
    @DisplayName("The title of the TodoItem object should not be empty")
    public void todoitemThrowsIfTitleIsEmpty() {
        Person person = new Person(1, "Mikael", "Engvall", "mikael.engvall.me@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, "", "description", LocalDate.now(), true, person));
    }

    @Test
    @DisplayName("The deadline of the TodoItem object should not be null")
    public void todoitemThrowsIfDeadlineIsNull() {
        Person person = new Person(1, "Mikael", "Engvall", "mikael.engvall.me@gmail.com");

        assertThrows(IllegalArgumentException.class,
                () -> new TodoItem(1, "title", "description", null, true, person));
    }

    @Test
    @DisplayName("When toString() is invoked on a TodoItem object it should be equal to the string provided in test")
    public void todoItemReturnsInformationWhenToStringIsInvoked() {
        Person Mikael = new Person(12, "Mikael", "Engvall", "mikael.engvall.me@gmail.com");
        TodoItem todoItem = new TodoItem(4, "Finish assignment", "Refer to previous lectures and reference material", LocalDate.of(2023, 8, 20), false, Mikael);
        assertEquals("TodoItem { id: 4, title: Finish assignment, task description: Refer to previous lectures and reference material, deadline: 2023-08-20, is overdue? false, done: false }", todoItem.toString());
    }
}