package factory.simpleFactory;

public class SimpleObjectFactory {

    public FakeObject createFakeObject(String type){
        FakeObject fakeObject = null;

        if(type.equals("typeOne")){
            fakeObject = new FakeTypeOne();
        }else{
            fakeObject = new FakeOtherTypes();
        }
        return  fakeObject;
    }



}
