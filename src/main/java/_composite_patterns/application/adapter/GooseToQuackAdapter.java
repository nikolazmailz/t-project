package _composite_patterns.application.adapter;

import _composite_patterns.application.Quackable;

public class GooseToQuackAdapter implements Quackable {
    Goose goose;

    public GooseToQuackAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
