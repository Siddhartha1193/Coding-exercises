/*
* This program calculates the hamming ditances of two given integers or strings
* 
* The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
* x = 1, y = 4
* x = 0000 0001
* y = 0000 0100
*           ^  ^ The bits are different at two positions. The hamming distance is 2.
* 
* x = abcde
* y = abcef
*        ^^  Hamming ditance is 2.
*
*/


import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class HammingDistance 
{

	public static void main(String[] args) throws java.lang.Exception
	{	
		HammingDistance hd = new HammingDistance();
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter integer 1:");
		int i = in.nextInt();
		System.out.println("Enter integer 2:");
		int j = in.nextInt();
		System.out.println("Hamming distance of " +i+ " and " +j+ " is: " + hd.hamming(i,j));

		System.out.println("Enter string 1: ");
		String p = br.readLine();

		System.out.println("Enter String 2: ");
		String q= br.readLine();

		System.out.println(" Hamming distance of " +p+ " and " +q+ " is: " +hd.hammingString(p,q));
	}

	public int hamming (int x, int y)
	{
		int xor = x^y;
		return Integer.bitCount(xor);
	}

	public int hammingString (String a, String b)
	{
		int length1= a.length();
		int length2= b.length();
		int distance = 0;
		if(length1 != length2)
		{
			System.out.println("The strings must be of equal length");
		}
		else
		{
			for(int l = 0; l < length1; l++)
			{
				if(a.charAt(l) != b.charAt(l))
				{
					distance += 1;
				}
			}
		}
		return distance;
	}
}