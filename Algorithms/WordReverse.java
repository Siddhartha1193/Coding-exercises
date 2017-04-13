/*
* This program takes a string and reverses each character of each word and prints it
* Sample input - Checking "reverse" of words in String
* Output - gnikcehC "esrever" fo sdrow ni gnirtS
*/


import java.io.*;
import java.util.*;
import java.lang.*;

public class WordReverse 
{
    /*
    * Takes the string and converts into a character array 
    * When a white space is encountered, the word is reversed and returned
    */
    public static String reverseWords(String s) 
    {
        int l= s.length();
        char[] s1 = s.toCharArray();
        int i = 0;
        for(int j = 1; j < s1.length -1; j++)
        {
            if(s1[j] == ' ')
            {
                reverse(s1, i, j - 1);
                i = j + 1;
            }
        }
        reverse(s1, i, s1.length - 1);
        return new String(s1);
    }   

    /*
    * Function to reverse a word
    */
    public static void reverse(char[] s, int l, int r)
    {
    	while(l < r)
    	{
    		char temp = s[l];
    		s[l] = s[r];
    		s[r] = temp;
    		l++; r--;
    	}
    }
 
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter the String to be reversed ");
        String s = br.readLine();
        System.out.println(" The string entered is : "+ s);
        System.out.println(" Reversing each letter of each word :");
        System.out.println(" Reversed String is : " + reverseWords(s));
        
    }        
}