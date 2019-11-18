package com.lt.designpatterns;

/**
 * 自己手写一个适配器
 * 客户端
 */
public class AdapterClient {
    public static void main(String[] args) {
        Adapter adapter = new LenovoAdapter();
        adapter.useHer();
        adapter = new DellAdapter();
        adapter.useHer();
    }
}

/**
 * 适配器
 */
interface Adapter {
    void useHer();
}

/**
 * 联想适配器
 */
class LenovoAdapter implements Adapter {

    private LenovoInterface anInterface;

    public LenovoAdapter() {
        System.out.println("您正在使用联想接口适配器！");
        anInterface = new LenovoInterface();
    }

    @Override
    public void useHer() {
        anInterface.useMe();
    }
}

/**
 * 戴尔适配器
 */
class DellAdapter implements Adapter {
    private DellInterface anInterface;

    public DellAdapter() {
        System.out.println("您正在使用戴尔接口适配器！");
        anInterface = new DellInterface();
    }

    @Override
    public void useHer() {
        anInterface.useMe();
    }
}

/**
 * 联想接口
 */
class LenovoInterface {
    public void useMe() {
        System.out.println("快使用我，我是联想接口");
    }
}

/**
 * 戴尔接口
 */
class DellInterface {
    public void useMe() {
        System.out.println("快使用我，我是戴尔接口");
    }
}

