package leetcode;

/**
 * Created by Gautam Vashisht on 8/8/2017.
 */
public class PattMatching {
    public static boolean isMatch(String s, String p) {

        if(p.isEmpty())
            return s.isEmpty();

        int sLen = s.length();
        int pLen = p.length();

        boolean[][] dp = new boolean[sLen+1][pLen+1];

        dp[0][0] = true;

        for(int j =2; j<=pLen; j++)
        {
            if(p.charAt(j-1) == '*')
                dp[0][j] =dp[0][j-2];
        }

        for(int i =1; i<=sLen; i++)
            for(int j=1; j<=pLen; j++)
            {
                if(p.charAt(j-1) != '*')
                {
                    dp[i][j] = (dp[i-1][j-1] && ((s.charAt(i-1)== p.charAt(j-1)) || (p.charAt(j-1) == '.')));
                }

                else
                    dp[i][j] = dp[i][j-1] || dp[i][j-2] ||  (s.charAt(i-1) == p.charAt(j-2)); ; //(i>1 && dp[i-1][j]);
            }

        return dp[sLen][pLen];
    }
        public static void main(String ar[])
        {
            String s = "aa";
            String p = ".*";

            System.out.println(isMatch(s,p));
        }
}
