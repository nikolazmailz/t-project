package factory.factoryMethod.type;

import factory.factoryMethod.FObject;

public class OneFObject implements FObject {
//    @Override
//    public FObject createFObject(String type) {
//        return null;
//    }

    @Override
    public String getName() {
        return "Hello!";
    }

    @Override
    public String getValue() {
        return "U W!N";
    }

    @Override
    public boolean getFObject() {
        return true;
    }
}
