// This program takes a character input and returns the comverted case of that character.
//

import java.util.*;
import java.io.*;

class CharReverse
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character ");
		ch = sc.next().charAt(0);
		if(ch >=65 && ch <=90)
		{
			ch = (char)(ch+32);
		}
		else if(ch >=97 && ch<=122)
		{
			ch = (char)(ch-32);
		}
		System.out.println(ch);
	}
}
