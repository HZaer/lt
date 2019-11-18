package com.lt.designpatterns;

/**
 * 自己手写一个桥接模式
 */
public class BridgeClient {
    public static void main(String[] args) {
        Color yellow = new Yellow();
        Clothes tShirt = new TShirt(yellow);
        tShirt.chooseClothes();
    }
}

/**
 * 颜色接口
 */
interface Color {
    void chooseColor();
}

/**
 * 黄颜色实现类
 */
class Yellow implements Color {

    @Override
    public void chooseColor() {
        System.out.println("choose yellow color");
    }
}

/**
 * 红颜色实现类
 */
class Red implements Color {

    @Override
    public void chooseColor() {
        System.out.println("choose red color");
    }
}

/**
 * 衣服抽象类
 */
abstract class Clothes {
    protected Color color;

    protected Clothes(Color color) {
        this.color = color;
    }

    abstract void chooseClothes();
}

/**
 * T恤衣服继承类
 */
class TShirt extends Clothes {

    public TShirt(Color color) {
        super(color);
    }

    @Override
    void chooseClothes() {
        System.out.println("choose TShirt clothes");
        color.chooseColor();
    }
}

/**
 * 夹克继承类
 */
class Jack extends Clothes {

    public Jack(Color color) {
        super(color);
    }

    @Override
    void chooseClothes() {
        System.out.println("Choose Jack clothes");
        color.chooseColor();
    }
}

