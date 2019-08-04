package factory.example.fac;

import factory.example.fac.ext.EmptyObjectAPI;
import factory.example.fac.ext.SimpleObjectAPI;

public class main {

    public static void main(String argp[]){

//        SimpleObjectFactory factory = new SimpleObjectFactory();
//        ObjectAPI pizzaStory = new ObjectAPI(factory);
//        pizzaStory.orderPizza("cheese");

        ObjectAPI simple = new SimpleObjectAPI();
        ObjectAPI empty = new EmptyObjectAPI();

        simple.orderPizza("simple type");
        empty.orderPizza("empty type");


    }
}
