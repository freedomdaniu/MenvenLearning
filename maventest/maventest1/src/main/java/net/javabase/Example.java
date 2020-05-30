package net.javabase;

import java.util.Arrays;

/**
 * @author Yangfengfan
 * @DATE 2020/05/18
 */
public class Example {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4,6,10,67, 89};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 8);
        System.out.println(index);
    }
}
