import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Epic;
import ru.netology.javaqa.Meeting;
import ru.netology.javaqa.SimpleTask;

public class TaskTest {
    @Test
    public void shouldFindSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("родителям");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotFindTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("мама");

        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldFindMeeting() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("Приложение");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotFindMeeting() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("среда");
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldFindEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Молоко");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotFindEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Вода");
        Assertions.assertFalse(actual);
    }
}
