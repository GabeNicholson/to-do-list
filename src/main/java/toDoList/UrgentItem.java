package src.main.java.toDoList;

public class UrgentItem extends ToDoItem {
    public UrgentItem(String description){
        super(description);
        urgencyLevel = "HIGH";
    }

    void getDescription(){
        System.out.println(description.toUpperCase());
    }
}
