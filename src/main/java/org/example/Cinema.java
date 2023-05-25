package org.example;

public class Cinema {
    private String titleFilm;
    private String genre;
    private double durationFilmInHours;

    public Cinema() {
    }

    public Cinema(String titleFilm, String genre, double durationFilmInHours) {
        this.titleFilm = titleFilm;
        this.genre = genre;
        this.durationFilmInHours = durationFilmInHours;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public void setTitleFilm(String titleFilm) {
        this.titleFilm = titleFilm;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDurationFilmInHours() {
        return durationFilmInHours;
    }

    public void setDurationFilmInHours(double durationFilmInHours) {
        this.durationFilmInHours = durationFilmInHours;
    }
}
