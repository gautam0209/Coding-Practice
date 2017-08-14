package leetcode;

/**
 * Created by Gautam Vashisht on 8/2/2017.
 */
public class WildCardMatching {
        public static boolean isMatch(String s, String p) {

            if(p.length() == 0)
                return false;
            int j =0;
            for(int i =0; i<s.length(); i++)
            {
                char ch = s.charAt(i);
                if(ch == p.charAt(j))
                    j++;
                else if(p.charAt(j) == '?')
                    j++;
                else if(p.charAt(j) == '*' && (j!=p.length()-1 && p.charAt(j+1) != ch))
                    continue;
                else if(p.charAt(j) == '*' && (j!=p.length()-1 && p.charAt(j+1) == ch))
                    j=j+2;
                else
                    return false;

                if(j == p.length() && i != s.length() - 1)
                    return false;
            }

            if(j== p.length())
                return true;
            else
            {
                if(p.charAt(j) == '*' && j + 1 == p.length())
                    return true;
                else
                    return false;
            }
        }

        public static void main(String ar[])
        {
            System.out.println(isMatch("abefcdgiescdfimde","ab*cd?i*de"));
        }
}
