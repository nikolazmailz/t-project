package _composite_patterns;

import _composite_patterns.application.Quackable;
import _composite_patterns.application.adapter.GooseImpl;
import _composite_patterns.application.adapter.GooseToQuackAdapter;
import _composite_patterns.application.composite.Flock;
import _composite_patterns.application.decarator.QuackCounter;
import _composite_patterns.application.factory.AbstractDuckFactory;
import _composite_patterns.application.factory.CountingDuckFactory;
import _composite_patterns.application.factory.DuckFactory;
import _composite_patterns.application.quackableImpl.DuckCall;
import _composite_patterns.application.quackableImpl.MallardDuck;
import _composite_patterns.application.quackableImpl.RedHeadDuck;
import _composite_patterns.application.quackableImpl.RubberDuck;

public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();

        //TODO add in decorator with factory
        System.out.println(" ");
        System.out.println("TODO add in decorator with factory");
        System.out.println(" ");
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseToQuackAdapter(new GooseImpl());

        System.out.println("Duck Simulation");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("Decorator run\nquack is: " + QuackCounter.getQuacks());

        System.out.println("\nComposite run\n");

        System.out.println("###composite###");
        Flock composite = new Flock();
        composite.add(mallardDuck);
        composite.add(redHeadDuck);
        composite.add(duckCall);
        composite.add(rubberDuck);
        composite.add(goose);
        simulate(composite);

        System.out.println("###compositeOneShape###");
        Flock compositeOneShape = new Flock();
        compositeOneShape.add(duckFactory.createMallardDuck());
        compositeOneShape.add(duckFactory.createMallardDuck());
        compositeOneShape.add(duckFactory.createMallardDuck());
        compositeOneShape.add(duckFactory.createMallardDuck());
        simulate(compositeOneShape);

    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseToQuackAdapter(new GooseImpl());

        System.out.println("Duck First Simulation");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
