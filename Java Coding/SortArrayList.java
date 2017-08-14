package hackerrank;

import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s)
    {
        if(cgpa>s.cgpa)
            return -1;
        else if(cgpa < s.cgpa)
            return 1;
        else if(fname.compareTo(s.fname)>0)
            return 1;
        else if(fname.compareTo(s.fname)<0)
            return -1;
        else
            return id>s.id?1:-1;
    }

    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class SortArrayList
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);


            testCases--;
        }

        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
