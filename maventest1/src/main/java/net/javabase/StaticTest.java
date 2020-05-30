package net.javabase;

/**
 * @author Yangfengfan
 * @DATE 2020/05/20
 */
public class StaticTest {
    final static double PI = 3.1415926;
    static int id;
    public static void methon(){
        //doing someting
    }
    public void methon2(){
        System.out.println(StaticTest.PI);
        System.out.println(StaticTest.id);
        StaticTest.methon();
        this.methon2();
    }
    /*private static void methon3(){
        StaticTest.methon2();
        return this;
        static int i = 0;
    } */
}
