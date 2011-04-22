package sort;

import java.util.*;

public class Student implements Comparable<Student>
{

    public Student(String s, double g)
    {
        name = s;
        gpa = g;
    }
    
    public int compareTo(Student s)
    {
        int toRet;
        
        toRet = name.compareTo(s.name);
        
        if (toRet == 0)
        {
            if (gpa < s.gpa)
                toRet = -1;
            else if (gpa > s.gpa)
                toRet = 1;
        }
        return toRet;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Student[] ar1 = new Student[100];
        Student[] ar2 = new Student[1000];
        Student[] ar3 = new Student[10000];
        Student[] ar4 = new Student[100000];
        
        Random rand = new Random();
        StringBuffer sb = new StringBuffer();
        char c;
        
        //Populate the Student array of length 100
        for(int i = 0; i < 100; i++)
        {
            sb.setLength(0);
            int nameLength = 5 + rand.nextInt(10);;
            for(int j = 0; j <= nameLength; j++)
            {
                c = (char)(rand.nextInt(26) + 'a');
                sb.append(c);
            }
            
            ar1[i] = new Student(sb.toString(), (double)rand.nextInt(4) + rand.nextDouble());
            
        }
        
        //Populate the Student array of length 1000
        for(int i = 0; i < 1000; i++)
        {
            sb.setLength(0);
            int nameLength = 5 + rand.nextInt(10);;
            for(int j = 0; j <= nameLength; j++)
            {
                c = (char)(rand.nextInt(26) + 'a');
                sb.append(c);
            }
            
            ar2[i] = new Student(sb.toString(), (double)rand.nextInt(4) + rand.nextDouble());
        }
        
      //Populate the Student array of length 10000
        for(int i = 0; i < 10000; i++)
        {
            sb.setLength(0);
            int nameLength = 5 + rand.nextInt(10);;
            for(int j = 0; j <= nameLength; j++)
            {
                c = (char)(rand.nextInt(26) + 'a');
                sb.append(c);
            }
            
            ar3[i] = new Student(sb.toString(), (double)rand.nextInt(4) + rand.nextDouble());
        }
        
      //Populate the Student array of length 100000
        for(int i = 0; i < 100000; i++)
        {
            sb.setLength(0);
            int nameLength = 5 + rand.nextInt(10);;
            for(int j = 0; j <= nameLength; j++)
            {
                c = (char)(rand.nextInt(26) + 'a');
                sb.append(c);
            }
            
            ar4[i] = new Student(sb.toString(), (double)rand.nextInt(4) + rand.nextDouble());
        }
        
        System.out.println("It takes " + Sort.quicksort(ar1) + " compare operations\nto sort " +
        		"an array of size 100\n");
        
        System.out.println("It takes " + Sort.quicksort(ar2) + " compare operations\nto sort " +
        "an array of size 1000\n");
        
        System.out.println("It takes " + Sort.quicksort(ar3) + " compare operations\nto sort " +
        "an array of size 10000\n");
        
        System.out.println("It takes " + Sort.quicksort(ar4) + " compare operations\nto sort " +
        "an array of size 100000\n");
        
        System.out.println(ar1[1].name);

    }

    String name;
    double gpa;
}
