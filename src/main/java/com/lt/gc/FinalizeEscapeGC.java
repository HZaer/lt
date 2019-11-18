package com.lt.gc;

/**
 * 对象自我拯救演示
 * finalize只会被系统运行一次，所以42~52这段代码自救失败了
 */
public class FinalizeEscapeGC
{
    public static FinalizeEscapeGC saveHook = null;

    private void isAlive()
    {
        System.out.println("yes,i am still alive :)");
    }

    @Override
    protected void finalize()
        throws Throwable
    {
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.saveHook = this;
    }

    public static void main(String[] args)
        throws Throwable
    {
        saveHook = new FinalizeEscapeGC();

        saveHook = null;
        System.gc();
        //finalize()方法会延迟，所以停顿0.5秒等待finalize方法被系统调用
        Thread.sleep(500);
        if (saveHook != null)
        {
            saveHook.isAlive();
        }
        else
        {
            System.out.println("no, i am dead :(");
        }

        saveHook = null;
        System.gc();
        //因为本对象的finalize方法已经在上面被系统调用了，所以在这里saveHook对象被回收了
        Thread.sleep(500);
        if (saveHook != null)
        {
            saveHook.isAlive();
        }
        else
        {
            System.out.println("no, i am dead :(");
        }

    }
}
