package strategy.example;


import strategy.example.Behavior.FlyBehavior;
import strategy.example.Behavior.QuackBehavior;
import strategy.example.Behavior.impl.FlyNoWay;
import strategy.example.Behavior.impl.QuackMute;

abstract public class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck(){}

    public void performFly(){ flyBehavior.fly();}

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("I'm swimming!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
}
