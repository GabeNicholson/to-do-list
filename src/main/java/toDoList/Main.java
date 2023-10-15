package src.main.java.toDoList;

public class Main {
    public static void main(String[] args) {
        ToDoListApp toDoApp = new ToDoListApp();
        ToDoItem clean = new RegularItem("clean house");
        toDoApp.addTask(clean);
        toDoApp.getList();
        System.out.println(toDoApp.numTasks);
        boolean isHouseClean = toDoApp.checkTaskStatus(clean);
        System.out.println(isHouseClean);
    }
}
