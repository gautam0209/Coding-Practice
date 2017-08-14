package leetcode;

/**
 * Created by Gautam Vashisht on 8/7/2017.
 */
public class StringToNumber {
        public static int myAtoi(String str) {

            boolean neg = false;

            StringBuffer number = new StringBuffer();



            if(str == null || str.equals(""))
                return 0;

            char[] arr = new char[str.length()];
            arr = str.toCharArray();

            int start =0;
            while(arr[start] == ' ')
                start++;

            if(arr[start] == '-')
            {     neg =true;
                start += 1;
            }
            if(!neg && arr[start] == '+')
            {
                neg = false;
                start += 1;
            }

            if(start >= str.length() || !Character.isDigit(arr[start]))
                return 0;

            while(start<str.length() && Character.isDigit(arr[start]))
            {
                number.append(arr[start++]);
            }
            long res =0;
            long negLimit = Integer.MAX_VALUE + 1l;

            if(start == str.length())
            {     res =  Long.parseLong(number.toString());
                if(neg)
                {
                    if(res > negLimit)
                        return Integer.MIN_VALUE;
                    else
                        return (int)(-1 * res);
                }
                else
                {
                    if(res > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                    else
                        return (int)res;
                }
            }
            else
                return 0;
        }

        public static void main(String ar[])
        {
            System.out.println(myAtoi("123"));
        }
}
