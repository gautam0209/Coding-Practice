package hackerrank;

import java.util.*;


public class DequeUnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> hs = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxSize =0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            hs.add(num);

            if(deque.size() == m){
                if(hs.size()>maxSize)
                    maxSize = hs.size();
                int ele = deque.remove();
                if(!deque.contains(ele))
                    hs.remove(ele);
            }


        }

        System.out.println(maxSize);
    }
}
