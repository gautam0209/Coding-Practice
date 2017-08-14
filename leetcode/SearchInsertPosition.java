package leetcode;

/**
 * Created by Gautam Vashisht on 8/8/2017.
 */
public class SearchInsertPosition {
        private static int mid, min = Integer.MAX_VALUE, index;
        public static int searchInsert(int[] nums, int target) {

            return searchBinary(nums, 0, nums.length-1, target);

        }

        public static int searchBinary(int[] nums, int left, int right, int target)
        {

            if(left >= right)
            {
                return index;
            }

            else
            {
                mid = (left+right)/2;
                if(target < nums[mid])
                {   if(nums[mid] - target < min)
                {   min = nums[mid] - target;
                    index = mid-1;
                }

                    return searchBinary(nums, left, mid-1,target);
                }
                else if(target > nums[mid])
                {
                    if(target - nums[mid] < min)
                    {   min = target - nums[mid];
                        index = mid+1;
                    }
                    return  searchBinary(nums, mid+1, right, target);
                }

                else
                    return mid;

            }


        }

        public static void main(String ar[])
        {
            int arr[] = {1};
            System.out.println(searchInsert(arr,2));
        }
}
