package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerPrime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        boolean prime = true;
        in.close();
        // Write your code here.
//        for(int i = 2; i<= (n.intValueExact())/2; i++)
//        {
//            if(n.remainder(new BigInteger(String.valueOf(i))).equals(new BigInteger("0")))
//            {
//                prime = false;
//                break;
//            }
//        }

        if(n.isProbablePrime(1))
            System.out. println("prime");
        else
            System.out.println("not prime");


    }
}
