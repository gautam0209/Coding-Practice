package hackerrank.dataStructures.arrays.stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameStack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        for(int a0 = 0; a0 < g; a0++){
            long sum =0, countA=0, countB = 0, max=0;
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            int tempSum =0, tempSumA =0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            for(int i = 0; i<=a.length-1; i++)
            {
                tempSumA += a[i];
                if(tempSumA>x)
                { tempSumA -= a[i];
                    break;
                }
                s1.push(a[i]);
                countA++;
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){

                b[b_i] = in.nextInt();
            }
            tempSum =0;
            for(int i = 0; i<= b.length-1; i++)
            {
                tempSum += b[i];
                if(tempSum>x)
                    break;
                s2.push(b[i]);
            }

            while(s2.size()>0)
            {
                s3.push(s2.pop());
            }

            max = countA;


            while(x>sum)
            {
                if(s3.size() == 0)
                    break;
                int next = s3.pop();
                while(next + tempSumA >x && s1.size()>0)
                {
                    tempSumA = tempSumA - s1.pop();
                    countA--;
                }

                tempSumA = tempSumA + next;

                if(tempSumA > x)
                    break;
                else
                    countA++;
                if(countA > max)
                    max = countA;
            }

            System.out.println(max);

        }
    }
}
