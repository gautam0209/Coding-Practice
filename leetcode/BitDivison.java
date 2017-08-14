package leetcode;

/**
 * Created by Gautam Vashisht on 8/10/2017.
 */
public class BitDivison {

    public  static int divide(int dividend, int divisor) {

        boolean neg = false;

        if(dividend == 0)
            return 0;

        if(divisor == 1)
            return dividend;
        //if(divisor == -1)
        //  return (~dividend + 1);

        if ((divisor < 0 && dividend >0 ) || (divisor > 0 && dividend <0 ))
            neg = true;

        long dividendL = Math.abs((long)dividend);
        long divisorL  = Math.abs((long)divisor);



        long count = 0;
        long result =0;
        long temp = 0;
        long tDivisor = divisorL;



        while(dividendL > 0)
        {
            if(dividendL < divisorL) {
                count = 0;
                temp = 0;
            }
            else if (dividendL == divisorL) {
                temp =0;
                count = 1;
            }
            else
                while(dividendL - tDivisor >= 0)
                {
                    temp = dividendL - tDivisor;
                    tDivisor = tDivisor << 1;
                    if(count == 0)
                        count = 1;
                    else
                        count = count << 1;
                }

            dividendL = temp;
            tDivisor = divisorL;
            result += count;
            count =0;

        }

        if(!neg && result == 1l + Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return neg ? (int)-result : (int)result;

    }
        public static void main(String ar[])
        {
            System.out.println(divide(-2147483648,-1));
        }
}
