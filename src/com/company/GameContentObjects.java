package com.company;

public class GameContentObjects {
    private int arrDay;
    private int typeInt;
    private String name;
    private int hour;
    private double rating;

    public GameContentObjects(int arrDay, int typeInt , String name,int hour, double rating){

        this.arrDay = arrDay;
        this.typeInt = typeInt;
        this.name = name;
        this.hour = hour;
        this.rating = rating;

    }

    public int getTypeInt() {
        return typeInt;
    }

    public int getHour() {
        return hour;
    }

    public int getArrDay() {
        return arrDay;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GameContentObjects{" +
                "arrDay=" + arrDay +
                ", typeInt=" + typeInt +
                ", name='" + name + '\'' +
                ", hour=" + hour +
                ", rating=" + rating +
                '}';
    }
}
