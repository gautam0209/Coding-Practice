package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class SubsetsBTGeeks {
    public static List<String> permute(String str) {
        List<String> list = new ArrayList<>();
        backtracking(list, str, 0, str.length()-1, str.length());
       // list.add("");
        //list.add(str);

        return list;
    }


    public static void backtracking(List<String> list, String str, int l, int r, int length) {
        if(str.length() != length)
            list.add(str);


        for(int i =l; i<=r; i++)
        {

            backtracking(list, str.substring(l,i+1), l+1, r, length);
        }


    }

    public static void main(String ar[])
    {
        Scanner scan = new Scanner(System.in);
        String s =  scan.next();
        Iterator<String> itr = permute(s).iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
