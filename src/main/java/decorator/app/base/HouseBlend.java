package decorator.app.base;

import decorator.app.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        desc = "Смешанный кофе";
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
