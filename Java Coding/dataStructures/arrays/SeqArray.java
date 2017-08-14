package hackerrank.dataStructures.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Gautam Vashisht on 7/16/2017.
 */
public class SeqArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("I am " + n);
        List<List<Integer>> seqList = new ArrayList<>();
        List<Integer> list;
        List<Integer> listRet;
        int x, query,y, lastAnswer =0, size, index;

        for(int i =0; i<n; i++)
        {
            list = new ArrayList<>();
            seqList.add(i,list);
        }
        int q = s.nextInt();
        System.out.println("q is " + q);

        for(int i=0;i<q;i++)
        {
            query = s.nextInt();
            x = s.nextInt();
            y = s.nextInt();
            index = (x ^ lastAnswer)%n;
            listRet = seqList.get(index);
            size = listRet.size();

            if(query == 1)
            {
                if(size ==0)
                    System.out.println("Printing at 0");
                listRet.add(size,y);
            }

            else
            {
                lastAnswer = listRet.get(y % size);
                System.out.println(lastAnswer);
            }

        }

    }
}