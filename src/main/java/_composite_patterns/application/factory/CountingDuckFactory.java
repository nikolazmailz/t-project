package _composite_patterns.application.factory;

import _composite_patterns.application.Quackable;
import _composite_patterns.application.decarator.QuackCounter;
import _composite_patterns.application.quackableImpl.DuckCall;
import _composite_patterns.application.quackableImpl.MallardDuck;
import _composite_patterns.application.quackableImpl.RedHeadDuck;
import _composite_patterns.application.quackableImpl.RubberDuck;

//TODO Сделать как декоратор
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
