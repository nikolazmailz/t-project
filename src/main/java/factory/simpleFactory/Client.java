package factory.simpleFactory;

public class Client {

    public static void main(String args[]){

        System.out.println("Game Enter");

        SimpleObjectFactory simpleObectFactory = new SimpleObjectFactory();
        SimpleObjectAPI simpleAPI = new SimpleObjectAPI(simpleObectFactory);

        simpleObectFactory.createFakeObject("FakeTypeOne");




    }

}
