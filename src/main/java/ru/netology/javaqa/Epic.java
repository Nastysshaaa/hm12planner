package ru.netology.javaqa;

public class Epic extends Task {
    private int id;
    private String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public int getId() {
        return id;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtasks) {  // циклом перебираем подзадачи
            if (subtasks.contains(query))
                return true;
        }
        return false;
    }
}
