package decorator.app.decorator;

import decorator.app.Beverage;

public class Cream extends CondimentDecorator {

    Beverage beverage;

    public Cream(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", со сливками";
    }

    @Override
    public double cost() {
        return 0.4 + beverage.cost();
    }
}
