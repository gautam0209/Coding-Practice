package leetcode;

import java.util.*;

public class Permutations2 {

    static List<List<Integer>> list1 = new ArrayList<>();

    public static List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> list = new HashSet<>();
        permute(nums, list, new ArrayList<Integer>(),new boolean[nums.length]);
        System.out.println("Lets start");
        int c =1;
        for(List<Integer> t : list)
        {   System.out.println(c++);
            for(Integer i : t)
                System.out.print(i + ",");
            System.out.println();
        }


        return new ArrayList<>(list);
    }

    public static Set<List<Integer>> permute(int[] nums, Set<List<Integer>> list, List<Integer> tempList, boolean[] b)
    {


        for(int i=0; i< nums.length; i++)
        {
            if(b[i]) continue;
            tempList.add(nums[i]);
            b[i] = true;
            permute(nums,list,tempList,b);
            tempList.remove(tempList.size() -1);
            b[i] = false;
        }

        if(tempList.size() == nums.length)
        {
            list.add(new ArrayList<>(tempList));
        }

        return list;

    }

    public static void main(String ar[])
    {
        //String[] arr = {"eat", "tea", "tan", "ate", "nat", "abc"};
        /*
        String[] arr = {"hos","boo","nay","deb","wow","bop","bob","brr","hey","rye","eve","elf","pup",
                "bum","iva","lyx","yap","ugh","hem","rod","aha","nam","gap","yea","doc","pen","job",
                "dis","max","oho","jed","lye","ram","pup","qua","ugh","mir","nap","deb","hog","let",
                "gym","bye","lon","aft","eel","sol","jab"};
                */
        int[] arr = {-1,2,0,-1};
        List<List<Integer>> l = permuteUnique(arr);


    }

}