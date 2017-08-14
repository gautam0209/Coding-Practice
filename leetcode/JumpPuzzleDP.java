package leetcode;

import java.util.*;

public class JumpPuzzleDP {

    public static int jump(int[] nums) {
        return jumpRecur(nums,0,nums.length-1);
    }

    public static int jumpRecur(int[] nums, int start, int target)
    {

        int res[] = new int[nums.length];
        Arrays.fill(res,Integer.MAX_VALUE);

        res[0] = 0;
        res[1] = 1;

        if(target == 0)
            return 0;
        else if(target == 1)
            return 1;

        else
        {
            for(int i=0;i<nums.length;i++)
            {
                for(int j=1;j<=nums[i];j++)
                {
                    if(i + j<=target)
                        if(1 + res[i] < res[i+j] && res[i] != Integer.MAX_VALUE)
                            res[i+j] = 1 +res[i];

                    if(res[target] == res[i] + 1)
                        break;
                }

                if(res[target] == res[i] + 1)
                    break;

            }

        }

        return res[target];
    }

    public static void main(String[] ar)
    {
       int[] arr = {3,0,2,1};
        System.out.println(jump(arr));
    }
}