package com.test.LeetCode.array;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/20 8:52 PM
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 删除排序数组中的重复项
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
 * 返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class rmArrayReqeatS {

    //双指针解决
    public static int[] getLength(int[] nums){
        int length = nums.length;
        //创建一个新的数组来存储集合中的未重复数字
        //int[] num = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length == 0){
            return nums;
        }
        for (int j = 0; j < nums.length; j++) {
            for (int i = j+1; i <nums.length;i++) {
                if (nums[j] == nums[i]) {
                    --length;
                    break;
                }else {
                    list.add(nums[j]);
                    break;
                }
            }
        }
        int[] array2 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            for (Integer inter:list) {
                array2[i] = inter;
            }
        }
        return array2;
        }


    public int removeDuplicates(int[] nums) {
        //边界条件判断
        if (nums == null || nums.length == 0)
            return 0;
        int left = 0;
        for (int right = 1; right < nums.length; right++)
            //如果左指针和右指针指向的值一样，说明有重复的，
            //这个时候，左指针不动，右指针继续往右移。如果他俩
            //指向的值不一样就把右指针指向的值往前挪
            if (nums[left] != nums[right])
                nums[++left] = nums[right];
        return ++left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,6,78,90,91};
        System.out.println("这里输出的是："+getLength(nums));
        System.out.println("==========");

        int[] length = getLength(nums);
        for (int inte: length) {
            System.out.println(inte);
        }
    }
}
