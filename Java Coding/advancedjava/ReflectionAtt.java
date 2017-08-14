package hackerrank.advancedjava;

import java.lang.reflect.*;
import java.util.*;

class Student{
    public void fun(){}
}

public class ReflectionAtt {

    public static void main(String[] args){

        try{
            Class student = Class.forName("hackerrank.advancedjava.Student");
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName().toString());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }

    }

}