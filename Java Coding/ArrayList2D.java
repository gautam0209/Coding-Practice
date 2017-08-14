package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gautam Vashisht on 7/3/2017.
 */
public class ArrayList2D {

    public static void main(String ar[])
    {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cols,r,c;
        ArrayList<Integer> temp;
        for(int i =0 ;i <n; i++)
        {
            temp = new ArrayList<Integer>();
            cols = s.nextInt();
            for(int j=0;j<cols;j++)
                temp.add(s.nextInt());

            al.add(temp);
        }

        //System.out.println(al.get(0).get(2));

        n = s.nextInt();
        for(int i =0;i<n;i++)
        {
            r = s.nextInt();
            c = s.nextInt();
            try {
                System.out.println(al.get(r-1).get(c-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }


    }
}
