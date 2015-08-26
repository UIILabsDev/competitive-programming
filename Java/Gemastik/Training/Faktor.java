/*
	@problem: Faktor
	@author: Nabil Muhammad Firdaus
	@created: August 8, 2015
	@edited: August 10, 2015
*/

import java.util.Scanner;
import java.lang.*;

public class Faktor
{

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int input;

		input = Math.abs(io.nextInt());

		for (int i = 1;i <= input;i++)
		{
			if (i * (input / i) == input) System.out.println(i + "x" + (input/i));
		}
	}

}