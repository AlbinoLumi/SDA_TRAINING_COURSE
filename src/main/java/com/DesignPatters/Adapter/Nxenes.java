package com.DesignPatters.Adapter;

public class Nxenes {
    private String name;
    private String surname;
    private int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Nxenes(String name, String surname, int mark) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
    }
}
