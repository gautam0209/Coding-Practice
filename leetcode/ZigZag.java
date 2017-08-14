package leetcode;

/**
 * Created by Gautam Vashisht on 8/7/2017.
 */
public class ZigZag {

        public static String convert(String s, int numRows) {

            if(s.length() == 0)
                return "";

            if(numRows >= s.length())
                return s;

            StringBuffer[] sb = new StringBuffer[numRows];

            for(int i =0; i<numRows; i++)
            {
                sb[i] = new StringBuffer();
            }

            int len =0;

            while(len<s.length())
            {

                for(int i =0; i<numRows && len <s.length(); i++)
                {
                    sb[i].append(String.valueOf(s.charAt(len++)));
                }

                for(int j = numRows-2; j>=1 && len < s.length(); j--)
                {
                    sb[j].append(s.charAt(len++));
                }
            }

            for(int i =1; i<numRows; i++)
            {
                sb[0].append(sb[i]);
            }

            return sb[0].toString();
        }

    public static void main(String ar[]) {
        convert("AB",1);

    }

}

