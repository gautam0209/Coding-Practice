package leetcode;

/**
 * Created by Gautam Vashisht on 8/12/2017.
 */
public class RainTrap {

    public static void main(String []ar)
    {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }


        public static int trap(int[] height) {

            if(height.length < 3)
                return 0;

            int length = height.length;

            int maxR = 0, maxL =0, temp =0, sum =0;

            for(int i=1; i<height.length-1; i++)
            {
                maxR = findMaxRight(height, i, maxR);
                maxL = findMaxLeft(height, i, maxL);
                if(Math.min(maxL,maxR) < height[i])
                    temp =0;
                else
                    temp = Math.min(maxR,maxL) - height[i];
                sum += temp;
               // System.out.println(temp + " for i = " + i);
            }

            return sum;

        }

        public static int findMaxLeft(int[] height, int i, int max)
        {
            if(i == 1)
                return height[0];
            if(height[i-1] > max)
                return height[i-1];
            else
                return max;
        }

        public static int findMaxRight(int[] height, int i, int max)
        {
            if(i == 1 || max == height[i])
                return findMax(height,i);
            else
                return max;
        }

        public static int findMax(int[] height, int index)
        {
            int max = height[index+1];
            for(int i = index+2; i<height.length; i++)
            {
                if(height[i] > max)
                    max = height[i];
            }

            return max;
        }


}
