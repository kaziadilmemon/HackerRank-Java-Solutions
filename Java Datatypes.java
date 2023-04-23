/* Task:
Input Format

The first line contains an integer,T, denoting the number of test cases.
Each test case,T, is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format

For each input variable n and appropriate primitive dataType , you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte < short < int < long ).

If the number cannot be stored in one of the four aforementioned primitives, print the line: */

import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {


Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

    for(int i=0;i<5;i++)
    {

        try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");


            if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
            }
            else if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {

                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                }

            else if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)    
            { 

                System.out.println("* int");
                System.out.println("* long");
            }

             else if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)  { 

                      System.out.println("* long");}






        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }
}
}










