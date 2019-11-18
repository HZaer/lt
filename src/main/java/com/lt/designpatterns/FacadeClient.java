package com.lt.designpatterns;

/**
 * 手写一个外观模式（门面模式）
 */
public class FacadeClient
{
    public static void main(String[] args)
    {
        Facade facade = new Facade();
        facade.comeOn();
    }
}

class Facade
{
    private Eat eat = new Eat();

    private Drink drink = new Drink();

    private Sleep sleep = new Sleep();

    void comeOn()
    {
        eat.eat();
        drink.drink();
        sleep.sleep();
    }

}

class Eat
{
    void eat()
    {
        System.out.println("吃饭");
    }
}

class Drink
{
    void drink()
    {
        System.out.println("喝酒");
    }
}

class Sleep
{
    void sleep()
    {
        System.out.println("睡觉");
    }
}
