package factory.simpleFactory;

public class Client {

    public static void main(String args[]){

        System.out.println("Game Enter");

        SimpleObjectFactory simpleObectFactory = SimpleObectFactory();
        SimpleAPI simpleAPI = new SimpleAPI();



    }

}
