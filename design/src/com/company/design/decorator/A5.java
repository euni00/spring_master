package com.company.design.decorator;

public class A5 extends  AudiDecorator {

    public A5(ICar audi, String modelName) {
        super(audi, modelName);
        this.modelPrice = 3000;
    }
}
