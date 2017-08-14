package hackerrank;

import java.util.*;

/**
 * Created by Gautam Vashisht on 7/3/2017.
 */
public class NegativeSubArray {
    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n-1];
        int sum ,count =0;
        for(int i =0; i<n; i++)
            arr[i] = s.nextInt();

        for(int i=0; i<n; i++)
            for(int j=i; j<n ; j++)
            {   sum =0;
                temp = Arrays.copyOfRange(arr,i,j+1);
                for(int num:temp)
                {
                    System.out.print(num + ",");
                    sum += num;

                }
                if(sum<0)
                    count++;
            }
        System.out.println(count);
    }
}
