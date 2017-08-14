package hackerrank.dataStructures.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgoCrush {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int op = s.nextInt();
        int startIndex, endIndex,value, max = arr[0], temp =0;

        for(int i =0;i<op ;i++)
        {
            startIndex = s.nextInt();
            endIndex = s.nextInt();
            value = s.nextInt();
            arr[startIndex-1] += value;
            if(endIndex<arr.length)
                arr[endIndex] -= value;
            System.out.println(Arrays.toString(arr));
            System.out.println("----");
        }



        for(int i =0; i<n; i++)
        {
            temp += arr[i];
            if(temp>max)
                max = temp;
        }

        System.out.println(max);

    }
}