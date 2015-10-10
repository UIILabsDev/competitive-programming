/*
	@problem: Prima
	@author: Nabil Muhammad Firdaus
	@created: August 10, 2015
*/

import java.util.Scanner;

public class Prima
{

	public boolean isPrime(int numb)
	{
		if (numb == 1)
		{
			return false;
		}
		else
		{
			for(int i = 2;i <= numb/2;i++)
				if(numb % i == 0) return false;

			return true;
		}
	}

	public static void main(String[] arg)
	{
		Scanner io = new Scanner(System.in);
		Prima p = new Prima();
		int input;

		input = io.nextInt();

		for (int i = 1;i <= input;i++)
		{
			if (p.isPrime(i))
				System.out.println(i + " Prima");
			else
				System.out.println(i + " Bukan Prima");
		}
	}

}