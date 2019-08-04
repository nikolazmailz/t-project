package factory.example.simple;

public class main {

    public static void main(String args[]){

        SimpleObjectFactory factory = new SimpleObjectFactory();
        ObjectAPI pizzaStory = new ObjectAPI(factory);
        pizzaStory.orderPizza("cheese");

        MyObject object = new SimpleObjectFactory().createPizza("nocheese");

        object.prepare();
        object.bake();
        object.cut();
        object.box();


    }
}
