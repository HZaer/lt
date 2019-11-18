package com.lt.designpatterns;

public class StrategyClient {
    public static void main(String[] args) {
        Sort bubbling = new BubblingSort();
        Strategy s = new Strategy();
        s.setSort(bubbling);
        s.useSortMethod();

        Sort marge = new MergeSort();
        s.setSort(marge);
        s.useSortMethod();
    }
}

/**
 * 排序算法接口
 */
interface Sort {

    void method();
}

/**
 * 冒泡排序
 */
class BubblingSort implements Sort {

    @Override
    public void method() {
        System.out.println("使用冒泡排序");
    }
}

/**
 * 归并排序
 */
class MergeSort implements Sort {

    @Override
    public void method() {
        System.out.println("使用归并排序");
    }
}

/**
 * 策略类
 */
class Strategy {
    private Sort sort;

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    void useSortMethod() {
        sort.method();
    }
}
