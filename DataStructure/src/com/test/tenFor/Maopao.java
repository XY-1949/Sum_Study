package com.test.tenFor;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/6 2:27 PM
 */

/**
 * 冒泡排序
 */
public class Maopao {


    public static int[] maoPaoSort(int[] sum){
        int temp = 0;

        for (int i = 0; i < sum.length; i++) {
            for (int j = 1; j < sum.length; j++) {
            if (sum[i] > sum[j]){
                temp = sum[i];
                sum[i] = sum[j];
                sum[j] = temp;
                }

        }
        return null;
    }
}
