package com.test.tenSort;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/6 9:31 PM
 */
public class SelectSortTest {
    public static void main(String[] args) {
        int[] sum = {24, 7, 9, 6, 4, 0, 8, 12};


        int[] ints1 = SelectionSort(sum);
        System.out.println("=========");
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }
    }

    public static int[] selectSort(int[] sum) {
        for (int i = 0; i < sum.length - i-1; i++) {
            //定义一个最小值
            int min = 1;
            for (int j = i+1; j < sum.length - i; j++) {
                if (sum[i] > sum[j]) {
                    min = sum[j];
                    sum[i] = min;
                    sum[j] = sum[i];
                }
                System.out.println("j:"+j);
            }
            for (int g = 0; g < sum.length; g++) {
                System.out.println(sum[g]);
            }
            System.out.println("================");
            System.out.println("i："+i);
        }
        return sum;
    }

        public static int[] SelectionSort(int[] arr) {

            System.out.println("交换之前：");
            for(int num:arr){
                System.out.print(num+" ");
            }
            //选择排序的优化
            for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
                int k = i;
                for(int j = k + 1; j < arr.length; j++){// 选最小的记录
                    if(arr[j] < arr[k]){
                        k = j; //记下目前找到的最小值所在的位置
                    }
                }
                //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
                if(i != k){  //交换a[i]和a[k]
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
            System.out.println();
            System.out.println("交换后：");
            for(int num:arr){
                System.out.print(num+" ");
            }
            return arr;
        }
    }

