// TodoListApp.java

import java.util.ArrayList;
import java.util.List;

public class TodoListApp {
    private List<Task> tasks;

    public TodoListApp() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setCompleted(true);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void updateTask(int index, String title, String description) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setTitle(title);
            task.setDescription(description);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println("Task " + (i + 1) + ": " + task);
            }
        }
    }

    public static void main(String[] args) {
        TodoListApp todoListApp = new TodoListApp();

        // Sample usage
        todoListApp.addTask(new Task("Complete Java assignment", "Finish the coding tasks for the Java assignment."));
        todoListApp.addTask(new Task("Buy groceries", "Buy milk, eggs, and bread from the supermarket."));

        todoListApp.displayTasks();
    }
}
