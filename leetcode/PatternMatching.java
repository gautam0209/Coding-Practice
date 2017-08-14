package leetcode;


public class PatternMatching {
    public static boolean isMatch(String s, String p) {

        for(int i=0, j=0; i<s.length() && j <p.length(); ++i)
        {
            System.out.println(i);
            char c = s.charAt(i);
            char nPat;

            char pat = p.charAt(j);
            if( j != p.length() -1)
                nPat = p.charAt(j+1);
            else
                nPat = '!';

            if(pat == '.')
                j++;
                //  else if(pat == '*')
                //    continue;
            else if(pat == c && nPat == '*')
                continue;
            else if(pat == c)
                j++;
            else if ( (pat != c && nPat != '*') && pat != '*')
                return false;
            else if(pat != c && nPat == '*') {
                j = j + 2;
                i = i - 1;
            }

            if(j == p.length() && i != s.length()-1)
                return false;

            if(i == s.length()-1)
            {
                if(j != p.length())
                {
                    if( (pat == '*' && j+1 == p.length()) || (nPat == '*' && j+2 == p.length()))
                        continue;
                    else
                        return false;
                }
            }

        }

        return true;

    }

    public static void main(String[] ar)
    {
        System.out.println(isMatch("a","ab*"));
    }
}