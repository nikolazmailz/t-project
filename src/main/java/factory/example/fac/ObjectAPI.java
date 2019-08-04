package factory.example.fac;

import factory.example.fac.type.MyObject;

public abstract class ObjectAPI {

//    SimpleObjectFactory factory;
//
//    public ObjectAPI(SimpleObjectFactory factory){
//        this.factory = factory;
//    }

    MyObject orderPizza(String type){
        MyObject pizza;

        pizza = createObject(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract MyObject createObject(String type);

}
