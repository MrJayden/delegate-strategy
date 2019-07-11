package com.learn.gupao.delegate;

public class MakeHomeMainTest {
    public static void main(String[] args) {
        new Boss().command(WorkType.BUY_BRICK,new MakeHomeDeployerA());
        System.out.println("--------------------------------------");
        new Boss().command(WorkType.BUY_CEMENT,new MakeHomeDeployerA());

    }
}