package com.test.tenSort;


/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/6 3:15 PM
 *
 * 选择排序
 *
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] sum = {2, 4, 44, 8, 1, 0, 9, 3};
        for (int i:selectSort(sum) ) {
            System.out.println(i + " ");
        }
    }

    public static int[] selectSort(int[] sum) {
        for (int i = 0; i < sum.length-1; i++) {
            //定义一个最小值
            int min = i;
            for (int j =  min + 1; j < sum.length; j++) {
                if (sum[j] < sum[min]) {
                    min = j;
                }
            }
            if (min != i){
                int temp = sum[i];
                sum[i] = sum[min];
                sum[min] = temp;
            }
        }
        return sum;
    }
}