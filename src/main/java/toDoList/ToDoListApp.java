package src.main.java.toDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoListApp {
    public List<String> list;
    int numTasks;

    public ToDoListApp() {
        this.list = new ArrayList<>();
        numTasks = 0;
    }
    public void addTask(String item){
        list.add(item);
        numTasks ++;
    }
    public void getList(){
        System.out.println("there are " + numTasks + " tasks.");
        System.out.println(list);
    }
    public void removeTask(String item){
        list.remove(item);
        numTasks --;
    }

    public boolean checkTaskStatus(String item) {
        if (list.contains(item)) {
            return true;
        }
        return false;
    }

}
