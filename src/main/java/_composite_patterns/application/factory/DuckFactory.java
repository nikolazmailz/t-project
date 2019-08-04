package _composite_patterns.application.factory;

import _composite_patterns.application.Quackable;
import _composite_patterns.application.quackableImpl.DuckCall;
import _composite_patterns.application.quackableImpl.MallardDuck;
import _composite_patterns.application.quackableImpl.RedHeadDuck;
import _composite_patterns.application.quackableImpl.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
