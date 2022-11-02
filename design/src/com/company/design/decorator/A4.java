package com.company.design.decorator;

public class A4 extends  AudiDecorator {

    public A4(ICar audi, String modelName) {
        super(audi, modelName);
        this.modelPrice = 2000;
    }
}
