package factory.factoryMethod;

import factory.factoryMethod.factory.FOneObjectStory;
import factory.factoryMethod.factory.FTwoObjectStory;

public class main {

    public static void main(String atgs[]){

        System.out.println("Hello, factory method!");

        ObjectStory objectStory = new FOneObjectStory();
        objectStory.getFObkect("one");

        ObjectStory twoStory = new FTwoObjectStory();
        twoStory.getFObkect("two");
        //twoStory.getFObkect("");

        //objectStory.getFObkect("");



    }

}
