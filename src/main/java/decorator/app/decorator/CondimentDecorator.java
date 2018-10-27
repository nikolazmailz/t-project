package decorator.app.decorator;

// абстранкный класс служащий оберткой над супер классом(в нашем случае beverage)
// для создания декораторов

import decorator.app.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract  String getDesc();
}
