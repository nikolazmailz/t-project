package _composite_patterns;

import _composite_patterns.application.Quackable;
import _composite_patterns.application.quackableImpl.DuckCall;
import _composite_patterns.application.quackableImpl.MallardDuck;
import _composite_patterns.application.quackableImpl.RedHeadDuck;
import _composite_patterns.application.quackableImpl.RubberDuck;

public class Main {

    public static void main(String args[]){

        //TODO FIRST SIMULATION
        Quackable mallarDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("Duck First Simulation");

        simulation(mallarDuck);
        simulation(redHeadDuck);
        simulation(duckCall);
        simulation(rubberDuck);
    }

    private static void simulation(Quackable duck) {
        duck.quack();
    }
}
