package factory.example.simple;

import factory.example.simple.impl.CheesePizza;
import factory.example.simple.impl.EmptyPizza;

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
