package leetcode;



/**
 * Created by Gautam Vashisht on 8/2/2017.
 * Mehtod: We need to group the anagrams
 * 1. Sort all the strings.
 * 2. Group the string that are same.
 * 3. Running time is exceeding for one test case.
 */

import java.util.*;

public class AnagramsSorting {
        public  static List<List<String>> groupAnagrams(String[] strs) {

            char[] arr = new char[strs[0].length()];
            String[] sorted = new String[strs.length];
            int[] ana = new int[strs.length];
            Arrays.fill(ana,-1);

            List<List<String>> list = new ArrayList<>();
            List<String> anagram ;

            int l =0;
            for(String s: strs)
            {
                arr = s.toCharArray();
                Arrays.sort(arr);
                sorted[l++] = new String(arr);
            }

            for(String s: strs)
            {
                System.out.println(s);
            }


            for(int i =0; i<sorted.length; i++)
            {
                if(ana[i] != 1)
                    continue;
                anagram = new ArrayList<>();
                anagram.add(strs[i]);
                for(int j =i+1;j<sorted.length; j++)
                {
                    if(sorted[i].equals(sorted[j]))
                    {       ana[j] = i;
                        anagram.add(strs[j]);
                    }
                }
                list.add(anagram);
            }


            return list;

        }

        public static void main(String ar[])
        {
            String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
            groupAnagrams(arr);
        }



}
