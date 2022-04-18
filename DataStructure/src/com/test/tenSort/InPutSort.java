package com.test.tenSort;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/7 6:10 PM
 */

import java.util.*;

/**
 * TODO
 * 实现插入排序
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 */

public class InPutSort {

    public static void main(String[] args) {
        int[] sum = {8,14,1,2,3,2,2,4,6,12,0,6,34,21,13,7,9};

        inputSort(sum);

    }

    public static int[] inputSort(int[] sum){
        //定义三个List集合的常用实现类集合：ArrayList，Vector，LinkedList；
        List<Integer> objects = new ArrayList<>();
        List<Integer> objects3 = new Vector<>();
        List<Integer> objects4 = new LinkedList<>();
        //定义三个Set集合的常用实现类集合：HashSet，LinkedHashSet，TreeSet；
        Set<Integer> objects1 = new HashSet<>();
        Set<Integer> objects2 = new LinkedHashSet<>();
        Set<Integer> objects5 = new TreeSet<>();

        for (int i:sum) {
            objects.add(i);
            objects1.add(i);
            objects2.add(i);
            objects3.add(i);
            objects4.add(i);
            objects5.add(i);
        }

        System.out.println("ArrayList：");
        for ( int i:objects) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("HashSet：");
        for (int i:objects1) {
            System.out.print(+i+", ");
        }
        System.out.println();
        System.out.println("LinkedHashSet：");
        for (int i:objects2) {
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("Vector：");
        for (int i:objects3) {
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("LinkedList：");
        for (int i:objects4) {
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("TreeSet：");
        for (int i:objects5) {
            System.out.print(i+", ");
        }
        return sum;
    }
}
