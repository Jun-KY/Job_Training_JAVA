package J25_06_09;

import java.util.Arrays;

public class Array {
    public static int sumAllNum(int[] nums){
        int sum = 0;

        for (int i = 0; i < nums.length; i ++){
            sum += nums[i];
        }
        return sum;
    }
    public static void main (String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++){
            System.out.println(nums[nums.length - i -1]);
        }
        for (int i = nums.length - 1; i >= 0; i --){
            System.out.println(nums[i]);
        }
        for (int num : nums) {
            System.out.println(num);
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);

        System.out.println(sumAllNum(nums));
    }
}
