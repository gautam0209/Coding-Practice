package leetcode;

/**
 * Created by Gautam Vashisht on 8/4/2017.
 */
import java.util.*;
public class PhoneNumber {

    private static Map<Character,String> map = new HashMap<>();
    private static List<List<Character>> l = new ArrayList<>();


    public static List<List<Character>>  letterCombinations(String digits, List<Character> list, int index)
    {
            for (int i = 0; i < 4; i++) {
                char val = digits.charAt(index);
                if((val != '7' && val != '9') && i == 3)
                    continue;
                String str = map.get(val);
                list.add(str.charAt(i));
                if(list.size()!=digits.length())
                    letterCombinations(digits,list,index+1);
                else
                    l.add(new ArrayList<>(list));
                list.remove(list.size()-1);
        }

        return l;
    }

    public static void main(String ar[])
    {
        map.put('2',"abc");
        map.put('9',"wxyz");
      //  map.put('4',"ghi");
        List<List<Character>> list = letterCombinations("29", new ArrayList<Character>(),0);

        List<String> res = new ArrayList<>();

        for(List<Character> l : list)
        {
            res.add(l.toString());
        }

        for(String s:res)
            System.out.println(s);

    }
}
