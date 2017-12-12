/*
You have been given a string s, which is supposed to be a sentence. However, someone forgot to put spaces between the different words, and for some reason they capitalized the first letter of every word. Return the sentence after making the following amendments:

Put a single space between the words.
Convert the uppercase letters to lowercase.
*/


import java.io.*;
import java.util.*;

public class SplitStrings
{
     static String x = "";
    public static void main ( String args[])
    {
       System.out.println("Enter the string to be split");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1= amendTheSentence(s);
       
        System.out.println("\""+x+"\"");
    }
    public static String amendTheSentence( String s)
    {
        String[] p = s.split("(?=\\p{Upper})");
        
        for(int i=0; i<p.length;i++)
        {
            x = x + (p[i].toString().toLowerCase()) + " ";
        }
        x= x.substring(0,x.length()-1);
        return x;
    }
}

