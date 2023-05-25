package org.example;

public class Viewer {
    private String name;
    private byte age;
    private int countMoviesWatched;

    public Viewer() {
    }

    public Viewer(String name, byte age, int countMoviesWatched) {
        this.name = name;
        this.age = age;
        this.countMoviesWatched = countMoviesWatched;
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

    public int getCountMoviesWatched() {
        return countMoviesWatched;
    }

    public void setCountMoviesWatched(int countMoviesWatched) {
        this.countMoviesWatched = countMoviesWatched;
    }
}
