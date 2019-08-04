package factory.factoryMethod.factory;

import factory.factoryMethod.FObject;
import factory.factoryMethod.ObjectStory;
import factory.factoryMethod.type.OneFObject;
import factory.factoryMethod.type.TwoFObject;

public class FOneObjectStory extends ObjectStory {
    @Override
    protected FObject createFObject(String type) {
        if(type.equals("one")){
            return new OneFObject();
        }else{
            return new TwoFObject();
        }
    }
}
