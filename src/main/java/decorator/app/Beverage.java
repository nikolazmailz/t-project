package decorator.app;

// Beverage - напиток(eng)

public abstract class Beverage {

    public String desc = "Unknow beverage";

    public String getDesc(){
        return desc;
    }

    public abstract double cost();

}
