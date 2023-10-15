package test.java.toDoList;

import src.main.java.toDoList.ToDoListApp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ToDoListAppTest {
    @Test
    void testAddTask (){
        ToDoListApp listApp = new ToDoListApp();
        listApp.addTask("test");
        assertEquals(listApp.list.size(), 1);
        }
}
