package com.learn.gupao.strategy;

public class OnDuty implements IOnDuty {
    private IVehicle vehicle;

    @Override
    public IOnDuty selectVehicle(Weather weather) {
       switch (weather){
           case RAINY: vehicle = new Car(); break;
           case SUNNY: vehicle = new Bycicle();break;
           case WINDY: vehicle = new Walk();break;
           default: vehicle = new Airplane();
       }
       return this;
    }
    @Override
    public void goToWork() {
           vehicle.onDutyByVehicle();
    }
}
