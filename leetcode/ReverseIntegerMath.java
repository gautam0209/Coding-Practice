package leetcode;

import java.util.Scanner;

/**
 * Created by Gautam Vashisht on 7/21/2017.
 */
public class ReverseIntegerMath {

    public static int reverse(int x) {

    int res =0;
     while(x != 0)
     {
        int rem = x%10;
        int resT = res*10 + rem;
        if((resT- rem)/10 != res)
            return 0;
        res = resT;
        x =x/10;
     }

     return res;

    }

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println(reverse(s.nextInt()));
    }
}
