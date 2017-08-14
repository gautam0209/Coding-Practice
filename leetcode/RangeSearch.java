package leetcode;

public class RangeSearch {
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];


        if(nums.length == 0)
        {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        int min =0, max =0;
        int index = searchBinary(nums, target, 0, nums.length-1);

        if(index == -1)
        {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }

        min = index;
        max = index;

        while(index>=1 && nums[index-1] == target)
        {
            min = index-1;
            index = index-1;
        }

        while(index<nums.length-1 && nums[index+1] == target)
        {
            max = index+1;
            index = index+1;
        }

        ans[0] = min;
        ans[1] = max;

        return ans;

    }

    public static int searchBinary(int[] nums, int target, int low, int high)
    {
        if( (low == high && nums[low]!= target) || low<high)
            return -1;

        if(nums[low] == target)
            return low;

        int med = (low + high)/2;

        if(target == nums[med])
            return med;
        else if(target>nums[med])
           return searchBinary(nums, target,med+1,high);
        else
          return  searchBinary(nums,target,low,med-1);

    }

    public static void main(String ar[])
    {
       // int[] arr = {1};
       // int[] arr = {5,7,7,8,8,10};
        int[] arr = {2,2};
        int[] res = searchRange(arr,1);
        System.out.println(res[0] + " " +res[1]);
    }
}