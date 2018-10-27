package decorator.app.decorator;

import decorator.app.Beverage;

public class Chocolate extends CondimentDecorator {

    Beverage beverage;

    public Chocolate(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", с шоколадом";
    }

    @Override
    public double cost() {
        return .5 + beverage.cost();
    }
}
