package com.learn.gupao.strategy;

public class Car implements IVehicle {
    @Override
    public void onDutyByVehicle() {
        System.out.println("今天下雨了，我开着我的法拉利车去上班了,沿途再撩个妹纸 ···");
    }
}
