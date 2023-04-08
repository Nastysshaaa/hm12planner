package ru.netology.javaqa;

public class SimpleTask extends Task {
    protected String title;
    protected int id;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}
