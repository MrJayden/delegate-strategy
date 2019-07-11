package com.learn.gupao.strategy;

public class Bycicle implements IVehicle {
    @Override
    public void onDutyByVehicle() {
        System.out.println("今天天气晴朗，空气清新，我骑着我的自行车上班可自在了");
    }
}
