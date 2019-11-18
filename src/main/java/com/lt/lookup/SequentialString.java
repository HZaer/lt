package com.lt.lookup;


/**
 * 顺序查找
 */
public class SequentialString {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d", "e"};
        String key = "c";
        long front = System.currentTimeMillis();
        System.out.println(sequentialLookup(a, key));
        System.out.println(System.currentTimeMillis() - front);
    }

    private static int sequentialLookup(String[] a, String key) {
        for (int i = 0; i < a.length; i++) {
            if (key != null) {
                if (key.equals(a[i])) {
                    return i;
                }
            }

        }
        return -1;
    }

    private static void replace(String[] a, int subscript) {
        String c = a[subscript];
        String flag;
        for (int i = subscript; i > 0; i++) {
            a[i] = a[i - 1];
        }
        a[0] = c;
    }
}
