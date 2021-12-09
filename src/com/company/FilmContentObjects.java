package com.company;

public class FilmContentObjects {
    private int arrDay;
    private int typeInt;
    private String name;
    private int year;
    private int hour;
    private double rating;

    public FilmContentObjects(int arrDay, int typeInt , String name, int year, int hour, double rating){

        this.arrDay = arrDay;
        this.typeInt = typeInt;
        this.name = name;
        this.year = year;
        this.hour = hour;
        this.rating = rating;

    }



    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getArrDay() {
        return arrDay;
    }

    public int getHour() {
        return hour;
    }

    public int getTypeInt() {
        return typeInt;
    }

    public int getYear() {
        return year;
    }
}
