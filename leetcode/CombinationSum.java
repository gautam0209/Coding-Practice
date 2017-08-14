package leetcode;

import java.util.Arrays;

/**
 * Created by Gautam Vashisht on 8/9/2017.
 */

import java.util.*;

public class CombinationSum {
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {

            List<List<Integer>> list = new ArrayList<>();
            int sum =0;
            getLists(candidates, new ArrayList<>(), list, target, 0);
            return list;

        }

        public static void getLists(int[] arr, List<Integer> temp, List<List<Integer>> list, int target, int start)
        {
            if(target == 0)
                list.add(new ArrayList<>(temp));
            else if(target <0)
                return;
            else
            for(int i=start; i<arr.length; i++)
            {
                temp.add(arr[i]);
                getLists(arr,temp,list,target-arr[i],i);
                temp.remove(temp.size()-1);
            }

        }




        public static void main(String ar[])
        {
            int[] arr = {2,3,6,7};
            List<List<Integer>> res = combinationSum(arr,7);
            for(List<Integer> l : res)
                System.out.println(Arrays.deepToString(l.toArray()));

        }
}
