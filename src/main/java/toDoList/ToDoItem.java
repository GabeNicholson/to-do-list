package src.main.java.toDoList;

public abstract class ToDoItem {
    public boolean isCompleted;
    int numDaysOnList;
    public String description;
    public String urgencyLevel;

    public ToDoItem(String description) {
        isCompleted = false;
        numDaysOnList = 0; // TODO: How do we update this across all items.
        this.description = description; // TODO: must be set by the user.
    }

    void addDay() {
        numDaysOnList ++;
    }

    abstract void getDescription();
}
