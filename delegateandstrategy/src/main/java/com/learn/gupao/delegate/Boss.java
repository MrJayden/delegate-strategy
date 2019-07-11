package com.learn.gupao.delegate;

public class Boss {

    public void command(WorkType workType, IDeployer deployer){
        deployer.doWork(workType);
    }
}
