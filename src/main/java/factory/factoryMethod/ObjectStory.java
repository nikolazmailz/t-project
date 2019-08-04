package factory.factoryMethod;


//Абстрактный класс получения объекта
public abstract class ObjectStory {

    public FObject getFObkect(String type){
        FObject fObject;

        fObject = createFObject(type);

        System.out.println(fObject.getName());
        System.out.println(fObject.getValue());
        System.out.println(fObject.getFObject());

        return fObject;

    }

    protected abstract FObject createFObject(String type);

}
