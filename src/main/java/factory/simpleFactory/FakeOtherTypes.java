package factory.simpleFactory;

public class FakeOtherTypes implements FakeObject {
    String name = "TWO WIM";
    String value = "DOUBLE WIN!";
    boolean thisFakeObject = true;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean getThisFakeObject() {
        return thisFakeObject;
    }
}
