package factory.example.fac;

import factory.example.fac.type.MyObject;
import factory.example.fac.type.impl.CheesePizza;
import factory.example.fac.type.impl.EmptyPizza;

public class SimpleObjectFactory {

    public MyObject createPizza(String type){
        MyObject pizza;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else{
            pizza = new EmptyPizza();
        }

        return pizza;
    }

}
