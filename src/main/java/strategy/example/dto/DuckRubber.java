package strategy.example.dto;

import strategy.example.Behavior.impl.FlyWithWay;
import strategy.example.Behavior.impl.QuackRubberDuck;
import strategy.example.Duck;

public class DuckRubber extends Duck {

    public DuckRubber(){
        flyBehavior = new FlyWithWay();
        quackBehavior = new QuackRubberDuck();
    }

    @Override
    public void display() {
        System.out.println("Duck show ...");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
