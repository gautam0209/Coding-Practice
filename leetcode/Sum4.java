package leetcode;

/**
 * Created by Gautam Vashisht on 7/31/2017.
 */

import java.util.*;

public class Sum4 {
        public static List<List<Integer>> fourSum(int[] nums, int target) {

            Arrays.sort(nums);
            List<Integer> list = null;
            List<List<Integer>> res = new ArrayList<>();
            for(int i =0; i<nums.length; i++)
            {
                int num1 = nums[i];
                if(i>0 && nums[i] == nums[i-1]) continue;
                for(int j =i+1; j<nums.length; j++)
                {

                    if(j-1 != i && nums[j] == nums[j-1]) continue;

                    int sum = num1 + nums[j];
                    int rem = target - sum;

                    int low = j + 1;
                    int high = nums.length-1;
                    while(high>low)
                    {
                        if(nums[low] + nums[high] > rem)
                            high--;
                        else if(nums[low] + nums[high] < rem)
                            low++;
                        else
                        {
                            list = new ArrayList<>();
                            list.add(num1);
                            list.add(nums[j]);
                            list.add(nums[low]);
                            list.add(nums[high]);
                            res.add(list);
                            low++; high--;
                        }

                    }


                }
            }

            return res;
        }

        public static void main(String ar[])
        {
            int[] arr = {-1,0,-5,-2,-2,-4,0,1,-2};
            fourSum(arr,-9);
        }
    }
