package hackerrank;


import java.math.BigDecimal;
import java.util.*;

class BigDecimalSort {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        BigDecimal[] bd = new BigDecimal[n+2];
        String temp;
        BigDecimal tempB;

        for(int i =0; i<n;i++)
            bd[i] = BigDecimal.valueOf(Double.parseDouble(s[i]));

        for(int i =0; i< n; i++) {

//            System.out.println("Before " + i + "th iteration:" );
//            for(String st : s)
//                System.out.println(st);

            for(int j=1; j<n-i; j++)
            {

                if(bd[j-1].compareTo(bd[j]) < 0)
                {
                    //System.out.println("Replacing " + s[i] + " and " + s[j]);
                    tempB = bd[j-1];
                    bd[j-1] = bd[j];
                    bd[j] = tempB;

                    temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;

                }
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    }
