package com.company;

public abstract class Critic{
    public double opinion;
    public Critic(double opinion){
        this.opinion = opinion;
    }
    public abstract double calculateRating();

}
