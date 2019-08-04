package _composite_patterns.application.adapter;

public class GooseImpl implements Goose {
    @Override
    public void honk() {
        System.out.println("Quack Honk of Goose");
    }
}
