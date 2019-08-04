package _composite_patterns.application.quackableImpl;

import _composite_patterns.application.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack DuckCall");
    }
}
