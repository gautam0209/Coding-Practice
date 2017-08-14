package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import javax.swing.text.Document;


public class HTMLParser{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            //String pattern = "^<(.*)>(.*)</(\\1)>+$";

            String pattern = "<(.+?)>([^<]+)<(/\\1)>";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(line);
            if(m.find())
                do {
                    System.out.println(m.group(2));
                }while(m.find());
            else
                System.out.println("None");

            testCases--;
        }
    }
}