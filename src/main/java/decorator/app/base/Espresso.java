package decorator.app.base;


import decorator.app.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
