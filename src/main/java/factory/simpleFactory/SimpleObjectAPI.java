package factory.simpleFactory;

public class SimpleObjectAPI {

    SimpleObjectFactory factory;

    public SimpleObjectAPI(SimpleObjectFactory factory){
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
