package leetcode;

import java.util.*;

/**
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class ReverseInteger {

    public static int reverse(int x) {

        boolean neg =false;

        if(x == Integer.MIN_VALUE)
            return 0;

        if(x <0){
            x*= -1;
            neg =true;
        }


        char[] arr = Integer.toString(x).toCharArray();
        char[] rev = new char[arr.length];
        for(int i = arr.length-1, j=0; i>=0; i--,j++)
            rev[j] = arr[i];

        long reverse = Long.parseLong(new String(rev));

        if(neg)
            reverse *= -1;

        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
            return 0;
        else
            return (int)reverse;


    }

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println(reverse(s.nextInt()));
    }
}

