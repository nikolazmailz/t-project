package decorator.app.decorator;

import decorator.app.Beverage;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", с молоком";
    }

    @Override
    public double cost() {
        return .3 + beverage.cost();
    }
}
