package com.company.design.decorator;

public class AudiDecorator implements ICar {

    protected ICar audi;
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(ICar audi, String modelName) {
        this.audi = audi;
        this.modelName = modelName;
    }

    @Override
    public int getPrice() {
        return audi.getPrice();
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + "의 가격은 " + (audi.getPrice() + modelPrice) + "만원 입니다.");
    }
}
