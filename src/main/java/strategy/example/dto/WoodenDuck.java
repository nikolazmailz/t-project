package strategy.example.dto;

import strategy.example.Behavior.impl.FlyWithWay;
import strategy.example.Behavior.impl.QuackDuck;
import strategy.example.Duck;

public class WoodenDuck extends Duck {

    public WoodenDuck(){
        flyBehavior = new FlyWithWay();
        quackBehavior = new QuackDuck();
    }

    @Override
    public void display() {
        System.out.println("Duck show ...");
        flyBehavior.fly();
        quackBehavior.quack();
    }

}
