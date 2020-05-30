package net.javabase;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Int32Value;

/**
 * @author Yangfengfan
 * @DATE 2020/05/20
 */
public class Summation {
    public static void main(String[] args) {
        String str[] = {"vas","va","346"};
        Integer ff = 100;
        Integer xx = Integer.parseInt(str[2]);
        System.out.println(xx);
        float vv = 4.342f;


        Number num = new Integer(999);
// 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int n = num.intValue();
        long ln = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
        System.out.println(b);

    }
}
