package net.javabase;

/**
 * @author Yangfengfan
 * @DATE 2020/05/20
 */
public class Compare {
    public static void main(String[] args) {
        String c1 = new String("abc");
        String c2 = new String("abc");
        String c3 = c1;
        System.out.println(c3==c2);
        System.out.println(c2.equals(c3));
    }
}
