import java.io.*;
import java.util.Arrays.*;

public class UniqueString
{
	public static void main(String args[]) throws IOException
	{
		char content;
		String s1 = "Paliid";
		String s2= "Palind";
		System.out.println(unique(s1,s2));
	}
	public static String sortString(String s)
	{
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);


	}
	public static boolean unique ( String s1, String s2)
	{
		if(s1.length()!= s2.length())
		{
			return false;
		}
		return sortString(s1).equals(sortString(s2));
	}
}