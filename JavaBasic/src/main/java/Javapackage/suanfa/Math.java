package Javapackage.suanfa;

import java.util.Arrays;

public class Math {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 3, 2, 1, 9, 8};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int a = sq2(arr1,2);
        //System.out.println(a);
        int[] arr3 = Arrays.copyOf(arr,10);
        int[] arr4 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(arr4));

    }
    //冒泡
    public static void sq(int[] arr) {
        int i;
        for (int i1 = 0; i1 < arr.length; i1++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    i = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]=i;
                }
            }
        }
    }
    //选择
    public static void sq1(int[] arr) {
        int min; //{4, 5, 6, 7, 3, 2, 1, 9, 8};
        for(int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i]=min;
                }
            }

        }
    }
    //二分
    public static int sq2(int[] arr , int num) {// {1, 2, 3, 4, 5, 6, 7, 8, 9}

        int act = 0;
        int end = arr.length-1;
        while (act <= end) {
            int mind=(act + end) /2;
            if (arr[mind] == num) {
                return mind;
            } else if (arr[mind] > num) {
                end = mind -1;
            }else{
                act = mind +1;
            }
        }
        return -1;
    }
}

