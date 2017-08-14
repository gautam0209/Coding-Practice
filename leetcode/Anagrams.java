package leetcode;

/*
Algo:
1. Permute the strs[i]
2. Check all the elements in strs that matches with its permutation, add them to same anagram
3. repeat
 */

import java.util.*;

public class Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        int[] arr = new int[strs.length];
        Arrays.fill(arr,0);
        List<String> permute = new ArrayList<>();
        List<List<String>> permutations = null;
        List<String> permutation = null;
        List<List<String>> anagrams = new ArrayList<>();
        List<String> anagram;

        for(int i=0;i<strs.length; i++)
        {
            anagram = new ArrayList<>();
            if(arr[i] == 0) {
                permutation = permute(strs[i], new ArrayList<>(), new ArrayList<>(), new boolean[strs[i].length()]);
                anagram.add(strs[i]);

                for (int j = i + 1; j < strs.length; j++) {
                    if (arr[j] == 0) {
                        if (permutation.contains(strs[j])) {
                            arr[j] = i + 1;
                            anagram.add(strs[j]);
                        }
                    }
                }
            }
            else continue;

            anagrams.add(anagram);
            for(String s:anagram)
                System.out.println(s);
            System.out.println();
        }

        return anagrams;

    }

    public static List<String> permute(String str, List<Character> tempList, List<String> res, boolean[] b)
    {
        if(tempList.size() == str.length())
        {
            StringBuilder result = new StringBuilder(str.length());
            for (Character c : tempList) {
                result.append(c);
            }
            res.add(result.toString());
        }

        for(int i=0;i<str.length(); i++)
        {
            if(tempList.contains(str.charAt(i)) && b[i]) continue;
            tempList.add(str.charAt(i));
            b[i] = true;
            permute(str, tempList,res,b);
            b[i] = false;
            tempList.remove(tempList.size()-1);
        }

        return res;

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
        String[] arr = {"pup","pup"};
        List<List<String>> l = groupAnagrams(arr);


    }
}