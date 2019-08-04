package factory.simpleFactory.type;

import factory.simpleFactory.FakeObject;

public class FakeTypeOne implements FakeObject {
    String name = "Hello";
    String value = "You WIN!";
    boolean thisFakeObject = true;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean getThisFakeObject() {
        return thisFakeObject;
    }
}
