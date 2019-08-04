package factory.example.simple;

public class ObjectAPI {

    SimpleObjectFactory factory;

    public ObjectAPI(SimpleObjectFactory factory){
        this.factory = factory;
    }

    MyObject orderPizza(String type){
        MyObject pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
