package strategy.example.dto;

import strategy.example.Behavior.impl.FlyWithWay;
import strategy.example.Duck;

public class DuckWithoutQuack extends Duck {

    public DuckWithoutQuack(){
        flyBehavior = new FlyWithWay();
    }

    @Override
    public void display() {
        System.out.println("Duck show ...");
        flyBehavior.fly();
    }
}
