package org.example;

import java.util.List;

public class Viewer {
    private String name;
    private byte age;
    private int countFilmsWatched;
    private List<Cinema> listFilmsWatched;

    public Viewer() {
    }

    public Viewer(String name, byte age, List<Cinema> listFilmsWatched) {
        this.name = name;
        this.age = age;
        this.countFilmsWatched = listFilmsWatched.toArray().length;
        this.listFilmsWatched = listFilmsWatched;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getCountFilmsWatched() {
        return countFilmsWatched;
    }

    public List<Cinema> getListFilmsWatched() {
        return listFilmsWatched;
    }

    public void setListFilmsWatched(List<Cinema> listFilmsWatched) {
        this.listFilmsWatched = listFilmsWatched;
    }
}
