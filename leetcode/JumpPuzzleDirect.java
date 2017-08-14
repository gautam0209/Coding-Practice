package leetcode;

/**
 * Created by Gautam Vashisht on 8/2/2017.
 */
public class JumpPuzzleDirect {
        public static int jump(int[] nums) {

            if(nums.length < 2)
                return 0;

            int maxIndex =0;
            int steps =0;
            int temp =0;

            for(int i=0; i<nums.length; i++)
            {
                maxIndex = Math.max(maxIndex, i+ nums[i]);
                if(maxIndex > temp )
                {   steps++;
                    if(maxIndex >= nums.length-1)
                        return steps;
                    temp = maxIndex;
                }
            }

            return steps;
    }

    public static void main(String[] ar)
    {
        int[] arr = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        System.out.println(jump(arr));
    }
}
