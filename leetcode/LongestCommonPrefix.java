package leetcode;

import java.util.*;

// BruteForce
/**
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0)
            return "";
        String res = strs[0];
        for(int i=1;i<strs.length;i++) {
            res = longestCommonPrefixRecur(strs[i], res);
        }

        return res;

    }

    public static String longestCommonPrefixRecur(String str1, String str2)
    {
        StringBuffer sb = new StringBuffer();
        for(int i=0, j=0; i<str1.length() && j<str2.length(); i++,j++)
        {
            if(str1.toCharArray()[i] == str2.toCharArray()[j])
            {
                sb.append(str1.toCharArray()[i]);
            }
            else
               break;
        }
        return sb.toString();
    }

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i< n; i++)
        {
            arr[i] = s.next();
        }
        longestCommonPrefix(arr);
    }
}
