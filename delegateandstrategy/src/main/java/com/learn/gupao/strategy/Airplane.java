package com.learn.gupao.strategy;

public class Airplane implements IVehicle {
    @Override
    public void onDutyByVehicle() {
        System.out.println("这么好的能见度，我准备模仿吃鸡游戏里，空降到公司楼顶");
    }
}
