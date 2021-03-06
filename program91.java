// Accept number from and check whether that number is strong number or not.
// Strong number is such anumber whose summation of factorral of digits is same as that number.
// Example : 145  1! + 4! + 5! = 145	true
// Example : 190  1! + 9! + 0! != 190	false
// Strong numbers are : 1	2	145		40585		.....

import java.lang.*;
import java.util.*;
class Digits
{
	boolean CheckStrong(int iNo)
	{
		int isum = 0, iFact = 1;
		int idigit = 0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		int itemp = iNo;
		
		while(iNo != 0)	// loop to get the digits
		{
			idigit = iNo % 10;	// digit 

			while(idigit != 0)	// factorial of digit
			{
				iFact = iFact * idigit;
				idigit--;
			}

			iNo = iNo/10;	// remove the digit
			isum = isum + iFact;	// add the factorial
			if(iSum > itemp)	// to break the loop early
			{
				break;
			}
			iFact = 1; 	// reset the variable
		}

		if(itemp == isum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Demo
{
	public static void main(String arg[])
	{
		boolean bret = false;
		Digits dobj = new Digits();
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number");
		int value = sobj.nextInt();
		bret = dobj.CheckStrong(value);
		if(bret == true)
		{
			System.out.println("Number is Strong");
		}
		else
		{
			System.out.println("Number is not strong");
		}
	}
}
