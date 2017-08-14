package leetcode;

import java.util.Scanner;

/**
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class PalindromInteger {
    public static boolean isPalindrome(int x) {

        int res = 0;
        int orig =x;

       // if(x <0 )
         //   return false;

        while(x != 0)
        {
            int rem = x%10;
            int resT = res*10 + rem;
            res = resT;
            x =x/10;
        }



        if(res == orig)
            return true;
        else return false;

    }

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println(isPalindrome(s.nextInt()));
    }
}
