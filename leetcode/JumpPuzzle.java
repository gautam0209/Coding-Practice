package leetcode;


public class JumpPuzzle {
    public static int jump(int[] nums) {
        return jumpRecur(nums,0,nums.length-1);
    }

    public static int jumpRecur(int[] nums, int start, int target)
    {
        int min = Integer.MAX_VALUE;

        if(start >= target)
            return 0;
        else
        {
            for(int i=1;i<=nums[start];i++)
            {
                int tempMin = jumpRecur(nums, start + i, target);
                if(1 + tempMin < min && tempMin != Integer.MAX_VALUE)
                    min = 1 + tempMin;
            }

        }

        return min;
    }

    public static void main(String[] ar)
    {
        int []arr = {3,2,1};
        System.out.println(jump(arr));
    }
}