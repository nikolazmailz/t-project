package factory.example.fac.ext;

import factory.example.fac.type.MyObject;
import factory.example.fac.ObjectAPI;
import factory.example.fac.type.impl.CheesePizza;

public class SimpleObjectAPI extends ObjectAPI {

    @Override
    protected MyObject createObject(String type) {
        System.out.println(type);
        return new CheesePizza();
    }
}
