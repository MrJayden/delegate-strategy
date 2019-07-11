package com.learn.gupao.strategy;

public class Walk implements IVehicle{
    @Override
    public void onDutyByVehicle() {
        System.out.println("今天天气气温适中，我准备绿色出行去上班，好嗨哟");
    }
}
