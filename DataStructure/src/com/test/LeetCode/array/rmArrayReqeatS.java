package com.test.LeetCode.array;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/20 8:52 PM
 */

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
    public static int removeDuplicates(int[] nums) {
       int numbers = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (i > 0 && nums[i-1] != nums[i]){
                //nums[i] = nums[i+1];
                numbers++;
            }else {

            }
        }
        for (int i:nums) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("numbers："+numbers);
        System.out.println(nums.length-numbers);
        return nums.length-numbers;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,6,78,90,91};
        System.out.println("这里输出的是："+removeDuplicates(nums));
    }
}
