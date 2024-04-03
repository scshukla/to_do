import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListAppTest {
    private TodoListApp todoListApp;

    @BeforeEach
    public void setUp() {
        todoListApp = new TodoListApp();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("Test Task", "This is a test task");
        todoListApp.addTask(task);
        assertEquals(1, todoListApp.getTasks().size());
        assertTrue(todoListApp.getTasks().contains(task));
    }

    @Test
    public void testMarkTaskAsCompleted() {
        Task task = new Task("Test Task", "This is a test task");
        todoListApp.addTask(task);
        todoListApp.markTaskAsCompleted(0);
        assertTrue(todoListApp.getTasks().get(0).isCompleted());
    }

    @Test
    public void testUpdateTask() {
        Task task = new Task("Test Task", "This is a test task");
        todoListApp.addTask(task);
        todoListApp.updateTask(0, "Updated Task", "This is an updated test task");
        assertEquals("Updated Task", todoListApp.getTasks().get(0).getTitle());
        assertEquals("This is an updated test task", todoListApp.getTasks().get(0).getDescription());
    }

    @Test
    public void testDeleteTask() {
        Task task = new Task("Test Task", "This is a test task");
        todoListApp.addTask(task);
        todoListApp.deleteTask(0);
        assertTrue(todoListApp.getTasks().isEmpty());
    }
}
