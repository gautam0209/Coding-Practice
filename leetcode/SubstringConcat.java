package leetcode;

/**
 * Created by Gautam Vashisht on 8/8/2017.
 */

import java.util.*;

public class SubstringConcat {

    public static List<Integer> findSubstring(String s, String[] words) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> temp = null;
        List<Integer> list = new ArrayList<>();

        for(String w : words)
        {
            if(map.containsKey(w))
                map.put(w,map.get(w) + 1);
            else
                map.put(w,1);
        }

        int wLen = words[0].length();

        int startIndex = -1;

        boolean checking = false;

        for(int i=0; i<s.length()-wLen + 1;)
        {

            if(temp == null)
                temp = new HashMap<>(map);

            String str = s.substring(i,i+wLen);

            if(temp.containsKey(str))
            {
                checking = true;
                if(startIndex == -1)
                    startIndex = i;

                if(temp.get(str)>1)
                    temp.put(str,temp.get(str)-1);
                else
                    temp.remove(str);

                if(temp.size() == 0)
                {
                    list.add(startIndex);
                    i = startIndex - wLen +1;
                    startIndex = -1;
                    temp = null;
                    checking = false;
                }

                i = i +wLen;
            }
            else
            {
                if(checking)
                {
                    i = startIndex + 1;
                    startIndex = -1;
                    temp = null;
                }
                else
                    i++;

                checking = false;

            }
        }

        return list;

    }

    public static void main(String[] args)
    {
        String[] words =  {"ab","ba","ba"};

        String str = "ababaab";


        List<Integer> l = findSubstring(str, words);

        for(int i : l)
            System.out.println(i);
    }


}
