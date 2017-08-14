package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GlassHour {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum = 0, maxSum = -9999999;

        for(int rows =0; rows <=3; rows++)
            for(int cols=0;cols<=3; cols++) {
                sum = 0;
                for (int i = rows; i < rows+3; i++) {
                    for (int j = cols; j < cols + 3; j++) {
                        if (i == rows + 1 && j != cols + 1) {
                        } else
                            sum += arr[i][j];
                    }

                }
                System.out.println(sum);
                if(sum > maxSum)
                    maxSum = sum;
            }
        System.out.println(maxSum);
    }
}