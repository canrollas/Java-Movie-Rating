package com.company;

public class MovieCritic extends Critic {
    private FilmContentObjects filmContentObjects;
    public MovieCritic(double opinion){
        super(opinion);
    }

    public void setFilmContentObjects(FilmContentObjects filmContentObjects) {
        this.filmContentObjects = filmContentObjects;
    }

    @Override
    public double calculateRating(){
        return filmContentObjects.getRating() + ((filmContentObjects.getHour() - 150) * 0.01) - ((2021 - filmContentObjects.getYear()) * 0.01) + (super.opinion);

    }
}
