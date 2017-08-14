package leetcode;

/**
 * Created by Gautam Vashisht on 7/28/2017.
 */
public class Substring {

        public static int strStr(String haystack, String needle) {

            char[] hs = haystack.toCharArray();

            if(haystack.length() == 0 && needle.length() == 0)
                return 0;
            if(haystack.length() == 0)
                return -1;
            if(needle.length() == 0)
                return 0;

            for(int i=0; i <= hs.length - needle.length(); i++)
            {

                int index =0;
                char[] res = new char[needle.length()];

                while(index<needle.length())
                    res[index] = hs[i + index++];

                if(new String(res).equals(needle))
                    return i;
            }

            return -1;

        }

        public static void main(String[] ar)
        {
            System.out.println(strStr("abc","abc"));
        }
}
