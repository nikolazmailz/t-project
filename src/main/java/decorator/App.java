package decorator;

import decorator.app.Beverage;
import decorator.app.base.Espresso;
import decorator.app.base.HouseBlend;
import decorator.app.decorator.Chocolate;
import decorator.app.decorator.Cream;
import decorator.app.decorator.Milk;

public class App {

    public static void main(String args[]){

        System.out.println("Дизайн паттерн - Декаратор :)");

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Chocolate(beverage1);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Cream(beverage2);
        beverage2 = new Milk(beverage2);

        Beverage beverage3 = new Espresso();

        System.out.println(beverage1.getDesc() + " " + beverage1.cost() + "$");
        System.out.println(beverage2.getDesc() + " " + beverage2.cost() + "$");
        System.out.println(beverage3.getDesc() + " " + beverage3.cost() + "$");


    }

}
