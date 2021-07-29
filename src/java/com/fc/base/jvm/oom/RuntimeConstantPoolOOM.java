package com.fc.base.jvm.oom;

/**
 * @ClassName RuntimeConstantPoolOOM
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/19 9:15 下午
 * @Version 1.0
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
//        String str1 = new StringBuilder("计算机").append("软件").toString();
//        System.out.println(str1.intern() == str1);

//        String str2 = new StringBuilder("ja").append("va").toString();
//        System.out.println(str2.intern() == str2);

        String a = "a";
        String b = "b";
        a = b;
        b = "c";
        System.out.println("a = " + a);
//        String aa = new String("aa");
//        String bb = new String("bb");
//        String cc = new String("dd");
//        aa = bb;
//        bb = cc;
//        System.out.println("aa = " + aa);

//        StringBuilder sb1 = new StringBuilder("sb1");
//        StringBuilder sb2 = new StringBuilder("sb2");
//        StringBuilder sb3 = new StringBuilder("sb3");
//        sb1 = sb2;
//        sb2 = sb3;
//        System.out.println(sb1);

        name name = new name();

        name = new name("ss");
        System.out.println(name);
    }

}
final class name{
    private Object object;

    public name() {
    }

    public name(Object object) {
        this.object = object;
    }

    /**
     * Gets the value of object. *
     *
     * @return the value of object
     */
    private Object getObject() {
        return object;
    }

    /**
     * Sets the object. *
     * <p>You can use getObject() to get the value of object</p>
     * * @param object object
     */
    private void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "name{" +
                "object=" + object +
                '}';
    }
}