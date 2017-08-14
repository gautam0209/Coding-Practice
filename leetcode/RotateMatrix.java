package leetcode;

import java.util.*;

public class RotateMatrix {

    public static void rotate(int[][] matrix) {
        int[][] rows = new int[matrix.length][matrix.length];
        int n = matrix[0].length;

        for(int i=0; i<matrix.length; i++)
        {
            int[] rowT = matrix[i];
            for(int j=0; j<rowT.length; j++)
                rows[i][j] = rowT[j];
        }

        for(int i=0; i<rows.length; i++)
        {
            int[] row = rows[i];
            for(int j=0;j<row.length; j++)
            {
                matrix[j][n-i-1] = row[j];
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }

    public static void main(String ar[])
    {
        int[][] mat = {{1,2},{3,4}};
        rotate(mat);
    }
}