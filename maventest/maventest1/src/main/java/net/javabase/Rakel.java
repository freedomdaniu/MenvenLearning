package net.javabase;

import java.util.Arrays;

/**
 * @author Yangfengfan
 * @DATE 2020/05/18
 */
public class Rakel {
    public static void main(String[] args) {
        String arr[] = new String[]{"ab","cd","123","hh"};
        String arr1[] ={"et","aa","bbc"};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int index = Arrays.binarySearch(arr,0,2,"cd");
        System.out.println(index);
    }
}
