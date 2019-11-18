package com.lt.designpatterns;

/**
 * 自己手写一个装饰器模式
 */
public class DecoratorClient
{
    public static void main(String[] args)
    {
        System.out.println("最原始的功能：");
        Phone phone = new CallOnlyPhone();
        phone.use();

        System.out.println("加入装饰器之后：");
        Phone musicPhone = new MusicPhone(phone);
        musicPhone.use();
    }
}

/**
 * 电话
 */
interface Phone
{
    void use();
}

/**
 * 只能打电话
 */
class CallOnlyPhone implements Phone
{

    @Override
    public void use()
    {
        System.out.println("打电话");
    }
}

/**
 * 装饰器
 */
class Decorator implements Phone
{
    protected Phone phone;

    public Decorator(Phone phone)
    {
        this.phone = phone;
    }

    @Override
    public void use()
    {
        this.phone.use();
    }
}

/**
 * 添加播放器功能
 */
class MusicPhone extends Decorator
{
    public MusicPhone(Phone phone)
    {
        super(phone);
    }

    public void use()
    {
        System.out.println("加入音乐播放功能");
        this.phone.use();
    }
}

