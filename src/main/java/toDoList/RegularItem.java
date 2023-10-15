package src.main.java.toDoList;

public class RegularItem extends ToDoItem {
    public RegularItem(String description) {
        super(description);
        urgencyLevel = "low";
    }

    @Override
    void getDescription() {
        System.out.println(description);
    }
}
