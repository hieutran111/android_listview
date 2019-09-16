package com.example.student.listviewproject;

public class FootballPlayer {
    private String name;
    private int birthday;
    private int country;

    public FootballPlayer(String name, int birthday, int country) {
        this.name = name;
        this.birthday = birthday;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }
}
