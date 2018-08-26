package strategy;

import strategy.example.Behavior.impl.QuackMute;
import strategy.example.Duck;
import strategy.example.dto.DuckReal;
import strategy.example.dto.DuckRubber;
import strategy.example.dto.WoodenDuck;

public class main {

    public static void main(String args[]){
        Ping ping = new Ping();
        ping.sayHello();

        Duck duckReal = new DuckReal();
        DuckRubber duckRubber = new DuckRubber();
        WoodenDuck woodenDuck = new WoodenDuck();

        duckReal.display();
        duckReal.performFly();
        duckReal.performQuack();
        duckReal.setQuackBehavior(new QuackMute());
        duckReal.display();
        duckReal.performQuack();


    }

}
