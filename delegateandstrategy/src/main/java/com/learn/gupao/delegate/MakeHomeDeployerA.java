package com.learn.gupao.delegate;

public class MakeHomeDeployerA implements IDeployer {
    @Override
    public void doWork(WorkType workType) {
        if(workType == WorkType.BUY_BRICK){
            new BuyBrickDeployee();
        }else if(workType == WorkType.BUY_CEMENT){
            new BuyCementDeployee();
        }
    }
}
