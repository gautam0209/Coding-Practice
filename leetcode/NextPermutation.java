package leetcode;

import java.util.*;
/**
 * Created by Gautam Vashisht on 8/2/2017.
 */
public class NextPermutation {

        public static void nextPermutation(int[] nums) {
            int i =0, min = Integer.MAX_VALUE, minIndex =0;
            for(i=nums.length-1; i>0; i--)
            {
                if(min>nums[i])
                {    min = nums[i];
                    minIndex = i;
                }

                if(nums[i]>nums[i-1])
                    break;
            }

            if(i == 0)
                Arrays.sort(nums);

            else
            {
                int temp = nums[i];
                for(int j = i+1; j<=minIndex; j++)
                {
                    nums[j-1] = nums[j];
                }

                nums[minIndex] = temp;
            }

            for(int n : nums)
                System.out.print(n+",");

        }
    public static void main(String ar[])
    {
        int[] arr = {1,4,3};
        nextPermutation(arr);
    }
}
