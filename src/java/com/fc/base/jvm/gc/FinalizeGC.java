package com.fc.base.jvm.gc;

/**
 * @ClassName FinalizeGC
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/7/8 8:24 下午
 * @Version 1.0
 */
public class FinalizeGC {
    public static FinalizeGC SAVE_HOOK = null;
    public void isAlive(){
        System.out.println("Yes,i'm still alive.");
    }
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("finalize method is executed.");
        FinalizeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new FinalizeGC();
        SAVE_HOOK = null;

        Thread.sleep(500);
        System.gc();
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("No,i'm dead ：(");
        }
        SAVE_HOOK = null;

        System.gc();
        Thread.sleep(1000);
        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("No,i'm dead ：(");
        }

    }
}
