package _composite_patterns.application.decarator;

import _composite_patterns.application.Quackable;

public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }
}
