package leetcode;

/**
 * Created by Gautam Vashisht on 8/4/2017.
 */
import java.util.*;

public class PermutationBySwap {


    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

         return permutations(nums,0,nums.length-1, list);

    }

    public static List<List<Integer>> permutations(int[] nums, int left, int right, List<List<Integer>> list)
    {
        for(int i=left; i<=right; i++)
        {
            swap(nums, left,i);
            permutations(nums, left+1,right ,list);
            swap(nums, i, left);
        }

       if(left == nums.length-1)
       {
           List<Integer> l = new ArrayList<>();
           for(int n : nums)
                   l.add(n);
           list.add(l);
       }


        return list;

    }

    public static void swap(int[] nums, int l, int r )
    {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String ar[])
    {
        int[] arr = {1,2,3};
        permute(arr);
    }


}
