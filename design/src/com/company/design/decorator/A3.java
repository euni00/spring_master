package com.company.design.decorator;

public class A3 extends  AudiDecorator {

    public A3(ICar audi, String modelName) {
        super(audi, modelName);
        this.modelPrice = 1000;
    }
}
