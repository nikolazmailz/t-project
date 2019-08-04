package strategy;

import strategy.example.Behavior.impl.FlyNoWay;
import strategy.example.Behavior.impl.FlyWithWay;
import strategy.example.Behavior.impl.QuackDuck;
import strategy.example.Behavior.impl.QuackMute;
import strategy.example.Duck;
import strategy.example.dto.DuckReal;
import strategy.example.dto.DuckRubber;
import strategy.example.dto.DuckWithoutQuack;
import strategy.example.dto.WoodenDuck;

public class main {

    public static void main(String args[]){


        Ping ping = new Ping();
        ping.sayHello();

        Duck duckReal = new DuckReal();
        Duck duckRubber = new DuckRubber();
        Duck woodenDuck = new WoodenDuck();

//        DuckWithoutQuack duckWithoutQuack = new DuckWithoutQuack();
//        duckWithoutQuack.display();
//        QuackDuck quackDuck = new QuackDuck();
//        duckWithoutQuack.setQuackBehavior(quackDuck);
//        duckWithoutQuack.performQuack();
//
//
//        duckReal.display();
        duckRubber.swim();
        duckRubber.display();
//        duckReal.performFly();
//        duckReal.performQuack();
//        duckReal.setQuackBehavior(new QuackMute());
//        duckReal.display();
//        duckReal.performQuack();


    }

}
