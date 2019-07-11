package com.learn.gupao.delegate;

public enum WorkType {

    BUY_BRICK("买砖"),
    BUY_CEMENT("买水泥"),
    ;

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    WorkType(String desc){
        this.desc = desc;
    }

}
