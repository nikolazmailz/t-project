package factory.simpleFactory;

public class SimpleAPI {

    SimpleObjectFactory factory;

    public SimpleAPI(SimpleObjectFactory factory){
        this.factory = factory;
    }

    public FakeObject getFakeObject(String type){
        FakeObject fakeObject;
        fakeObject = factory.createFakeObject(type);

        System.out.println(fakeObject.getName());
        System.out.println(fakeObject.getValue());
        System.out.println(fakeObject.getThisFakeObject());

        return fakeObject;
    }




}
