package factory.example.fac.ext;

import factory.example.fac.type.MyObject;
import factory.example.fac.ObjectAPI;
import factory.example.fac.type.impl.EmptyPizza;

public class EmptyObjectAPI extends ObjectAPI {
    @Override
    protected MyObject createObject(String type) {
        System.out.println(type);
        MyObject myObject = new EmptyPizza();

        return new EmptyPizza();
    }
}
