package hackerrank;

import java.util.*;

public class StackBrackets{

    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        ArrayList<Boolean> list = new ArrayList<>();

        int k = 0;
        boolean error;

        while (k++<1) {
            error = false;
            String input=sc.next();
            char[] arr = input.toCharArray();
            stack.removeAllElements();

            for(int i =0; i<arr.length; i++) {
                try {
                    if (arr[i] == ')') {
                        if (!stack.pop().equals('(')) {
                            break;

                        }

                    } else if (arr[i] == '}') {
                        if (!stack.pop().equals('{')) {
                            break;
                        }
                    } else if (arr[i] == ']') {
                        if (!stack.pop().equals('[')) {
                            break;
                        }
                    }
                    else
                        stack.push(arr[i]);
                }

                catch(Exception e)
                {
                    list.add(false);
                    error =true;
                    break;
                }


            }

            if(!error)
                if(stack.size() == 0)
                    list.add(true);
                else
                    list.add(false);



        }

        for(boolean l: list)
            System.out.println(l);

    }
}
