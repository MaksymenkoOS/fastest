package org.sandromax.fastest.domain;

public class Student {
    private int id;
    private String name;
    private String email;

    public Student() {
        id = 0;
        name = "";
        email = "";
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
