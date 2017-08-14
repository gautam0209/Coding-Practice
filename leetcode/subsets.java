package leetcode;

import java.util.*;

/**
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));

        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            System.out.println(Arrays.deepToString(tempList.toArray()));
            System.out.println("**");
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++)
            a[i] = s.nextInt();
        List<List<Integer>> list =  subsets(a);
        Iterator<List<Integer>> itr = list.iterator();
//        while(itr.hasNext())
//        {
//            System.out.println(Arrays.deepToString(itr.next().toArray()));
//        }
    }
}
