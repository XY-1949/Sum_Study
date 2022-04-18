package com.test.tenSort;

import com.sun.xml.internal.fastinfoset.algorithm.FloatEncodingAlgorithm;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/7 7:04 PM
 * 快速排序：
 * 1，选择一个基准数，作为第一次的比较值
 * 2，进行比较，将大于基准数的放到右边，小于基准数的放到左边
 * 3，通过循环遍历，大于基准值的放到了基准值的左边，小于基准值的放到了基准值的左边
 * 4，继续递归基准数左边的和右边的数值
 *
 *
 * https://blog.csdn.net/shujuelin/article/details/82423852?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522164932762216782092974180%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=164932762216782092974180&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-82423852.142^v7^control,157^v4^control&utm_term=%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8Fjava&spm=1018.2226.3001.4187
 */
public class QuickSort {
   public static int[] quickSort(int[] sum,int begin,int end){
       if (sum.length == 0){
           System.out.println("玩那，这是一个空数组！！！！");
           return sum;
       }
       //设置一个变量temp为基准数
       int b,e,temp;
       b = begin;
       e = end;
       for (int i = 0; i < sum.length; i++) {
       }
       //取中间值为temp
            //先判断集合元素的数量是单数还是双数
            if (sum.length%2 == 1){
                temp = sum[(sum.length+1)/2];
            }else {
                temp = sum[sum.length/2];
            }
       for (int i = 0; i <sum.length ; i++) {
           
       }
       return sum;
   }
    public static void main(String[] args) {
        int[] sum = {1,4,7,9,1,11,10,32,0};
        quickSort(sum,0,sum.length);
    }


}
