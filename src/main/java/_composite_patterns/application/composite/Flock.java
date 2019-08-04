package _composite_patterns.application.composite;

import _composite_patterns.application.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quackable){
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }
}
