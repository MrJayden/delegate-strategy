package com.learn.gupao.strategy;

public enum Weather {


    SUNNY(1,"sunny"),
    RAINY(2,"rainy"),
    WINDY(3,"windy"),
    CALM(4,"calm"),
    ;

    private int num;

    private String weather;

    Weather(int num,String weather){
        this.num =num;
        this.weather = weather;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
