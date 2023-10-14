package src.main.java.toDoList;

public class Main {
    public static void main(String[] args) {
        ToDoListApp toDoApp = new ToDoListApp();
        toDoApp.addTask("clean house");
        toDoApp.getList();
        toDoApp.removeTask("clean house");
        toDoApp.getList();
        System.out.println(toDoApp.numTasks);
        boolean isHouseClean = toDoApp.checkTaskStatus("clean house");
        System.out.println(isHouseClean);
    }
}
