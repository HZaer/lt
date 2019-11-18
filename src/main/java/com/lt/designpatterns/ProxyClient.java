package com.lt.designpatterns;

/**
 * 手写一个代理模式
 */
public class ProxyClient {
    public static void main(String[] args) {
        DellProxyInterface dellProxyInterface = new ProxyPerson();
        System.out.println("正在为您进行代理购物！！");
        dellProxyInterface.buyMe();
    }
}

/**
 * 代理接口
 */
interface DellProxyInterface {
    void buyMe();
}

/**
 * 戴尔电脑
 */
class DellComputer implements DellProxyInterface {

    @Override
    public void buyMe() {
        System.out.println("快买我，我快等不及了！");
    }
}

/**
 * 代理人
 */
class ProxyPerson implements DellProxyInterface {
    private DellComputer dellComputer;

    @Override
    public void buyMe() {
        buyBefore();
        if (dellComputer == null) {
            dellComputer = new DellComputer();
        }
        dellComputer.buyMe();

    }

    private void buyBefore() {
        System.out.println("别急，我是老鸨，先来点手续费！");
    }
}
