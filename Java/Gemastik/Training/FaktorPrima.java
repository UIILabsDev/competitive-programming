/*
	@problem: FaktorPrima
	@author: Nabil Muhammad Firdaus
	@created: August 10, 2015
*/

import java.util.Scanner;

// public class FaktorPrima extends ExecutionTimer
public class FaktorPrima
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

	public static void main(String[] args)
	{
		// ExecutionTimer t = new ExecutionTimer();
		Scanner io = new Scanner(System.in);
		FaktorPrima f = new FaktorPrima();
		int[] prime = new int[1000];
		int input, idx = 0;

		input = io.nextInt();

		for (int i = 1;i <= 1000;i++)
			if (f.isPrime(i)) prime[idx++] = i;

		idx = 0;
		while (true)
		{
			if (input % prime[idx] == 0)
			{
				input /= prime[idx];
				if (input != 1)
				{
					System.out.print(prime[idx] + "x");
				}
				else
				{
					System.out.print(prime[idx]);
					break;
				}
			}
			else
			{
				idx++;
			}
		}

		// t.end();
		// System.out.println("\n\n...elapsed time : " + t.duration() + " ms");
	}

}
