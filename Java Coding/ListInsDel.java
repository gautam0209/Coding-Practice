package hackerrank;

/**
 * Created by Gautam Vashisht on 7/10/2017.
 */

import java.util.*;

public class ListInsDel {

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int i=0;
        List<Integer> l = new ArrayList<>();

        while(i++<n)
        {
            l.add(s.nextInt());
        }

        int op  = s.nextInt();
        i = 0;
        while(i++<op) {
            String q1 = s.next();

            if (q1.equals("INSERT")) {
                int pos = s.nextInt();
                int ele = s.nextInt();
                l.add(pos, ele);
            }

            if(q1.equals("DELETE")){
                int pos = s.nextInt();
                l.remove(pos);
            }

        }

        for(int list: l)
            System.out.println(list);

    }

}

