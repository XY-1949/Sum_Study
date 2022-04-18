package com.test.tenSort;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/6 2:27 PM
 */

/**
 * TODO
 * 冒泡排序
 */
public class Maopao {
    public static void main(String[] args) {
        int[] sum = {2,4,44,8,1,0,9,3,7,33};
        int[] result = maoPaoSort(sum);
        for (int i = 0; i < result.length; i++) {
             int add = result[i];
            System.out.println(add);
        }
    }

    /**
     * 冒泡算法
     * @param
     * @return
     * @author  Yinsd
     */
    public static int[] maoPaoSort(int[] sum) {
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                if (sum[i] < sum[j]) {
                    int temp = sum[i];
                    sum[i] = sum[j];
                    sum[j] = temp;
                }
            }
        }
        return sum;
    }
}
