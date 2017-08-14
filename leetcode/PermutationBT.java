package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class PermutationBT {

    public static List<List<String>> permute(String[] nums) {
        List<List<String>> list = new ArrayList<>();
        backtracking(list, new ArrayList<Integer>(), nums);

        return list;
    }

    public static void backtracking(List<List<String>> list, List tempList, String[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(tempList.contains(arr[i]))
                continue;
            tempList.add(arr[i]);
            backtracking(list,tempList,arr);
            tempList.remove(tempList.size()-1);
        }

        //System.out.println(Arrays.deepToString(tempList.toArray()));
        System.out.println("**");

        if(tempList.size() == arr.length) {
            System.out.println(Arrays.deepToString(tempList.toArray()));
            list.add(tempList);
        }
    }

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        String[] a = new String[3];
        for(int i=0; i<3; i++)
            a[i] = s.next();
        permute(a);
    }
}
