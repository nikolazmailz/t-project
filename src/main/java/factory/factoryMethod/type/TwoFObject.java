package factory.factoryMethod.type;

import factory.factoryMethod.FObject;

public class TwoFObject implements FObject {
    @Override
    public String getName() {
        return "OK!";
    }

    @Override
    public String getValue() {
        return "U 2W!N";
    }

    @Override
    public boolean getFObject() {
        return true;
    }
}
