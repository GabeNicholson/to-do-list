package src.main.java.toDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoListApp {
    public List<ToDoItem> list;
    public int numTasks;

    public ToDoListApp() {
        this.list = new ArrayList<ToDoItem>();
        numTasks = 0;
    }
    public void addTask(ToDoItem item){
        list.add(item);
        numTasks ++;
    }
    public void getList(){
        System.out.println("there are " + numTasks + " tasks.");
        System.out.println(list);
    }
    public void removeTask(ToDoItem item){
        list.remove(item);
        numTasks --;
    }

    public void clearList() {
        list.clear();
        numTasks = 0;
        System.out.println("cleared todo list");
    }

    public boolean checkTaskStatus(ToDoItem item) {
        if (list.contains(item)) {
            return true;
        }
        return false;
    }
}
