package test.java.toDoList;

import src.main.java.toDoList.RegularItem;
import src.main.java.toDoList.ToDoItem;
import src.main.java.toDoList.ToDoListApp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ToDoListAppTest {
    @Test
    void testAddTask () {
        ToDoListApp listApp = new ToDoListApp();
        ToDoItem test = new RegularItem("test");
        listApp.addTask(test);
        assertEquals(listApp.list.size(), 1);
    }
    @Test
    void testClearList(){
        ToDoListApp listApp = new ToDoListApp();
        ToDoItem test = new RegularItem("test");
        listApp.addTask(test);
        listApp.addTask(test);
        listApp.addTask(test);
        listApp.clearList();
        assertEquals(listApp.checkTaskStatus(test), false);
        assertEquals(listApp.numTasks, 0);
    }
}
