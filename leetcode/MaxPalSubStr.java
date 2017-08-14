package leetcode;

public class MaxPalSubStr {

    public static String longestPalindrome(String s) {
        int size = s.length();

        int[][] pal = new int[size][size];
        int max = 0;
        int maxI =0, maxJ =0;


        for(int i=0; i<size; i++)
        {    pal[i][i] = 1;
            if(i != size-1){
                pal[i][i+1] = s.charAt(i) == s.charAt(i+1)?2:-1;
                pal[i+1][i] = s.charAt(i) == s.charAt(i+1)?2:-1;
            }
        }

        for(int i=size-1;i>=0; i--)
            for(int j=i; j<size; j++)
            {
                if(pal[i][j] == 0)
                {
                    if(s.charAt(i) == s.charAt(j) && (j-i<3 || pal[i+1][j-1] >0))
                        pal[i][j] = pal[i+1][j-1] + 2;
                    else
                        pal[i][j] = -1;
                }
            }

        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
            {
                if(pal[i][j] > max)
                {
                    max = pal[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }

        return s.substring(maxI,maxJ+1);



    }

    public static void main(String ar[])
    {
        System.out.println(longestPalindrome("abcba"));
    }
}