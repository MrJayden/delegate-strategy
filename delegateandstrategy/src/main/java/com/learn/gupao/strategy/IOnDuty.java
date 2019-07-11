package com.learn.gupao.strategy;

public interface IOnDuty {
    IOnDuty selectVehicle(Weather weather);
    void goToWork();
}
