// Accept string from user and count number of words from that string

// Input : Hello World india Demo
// Output : 4

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);

			System.out.println("Enter first string");
			String str = sobj.nextLine();

			MyString mobj = new MyString();

			int iret = mobj.CountWords(str);
			
		
			System.out.println("Strings contains "+ iret + " words");
		
		}
		catch(Exception obj)
		{}
	}
}

class MyString
{
	int CountWords(String str) throws Exception
	{
		//String arr[] = str.split(" ");
		return ((str.split(" ")).length);
	}
}






