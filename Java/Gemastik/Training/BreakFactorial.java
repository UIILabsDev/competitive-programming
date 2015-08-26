/*
	@problem: BreakFactorial
	@author: Nabil Muhammad Firdaus
	@created: August 10, 2015
*/

import java.util.Scanner;

// public class BreakFactorial extends ExecutionTimer
public class BreakFactorial
{

	public boolean isPrime(int numb)
	{
		for(int i = 2;i <= numb/2;i++)
			if(numb % i == 0) return false;

		return true;
	}

	public static void main(String[] args)
	{
		// ExecutionTimer t = new ExecutionTimer();
		Scanner io = new Scanner(System.in);
		BreakFactorial f = new BreakFactorial();
		int input, n;

		n = io.nextInt();

		for (int k = 0;k < n;k++)
		{
			input = io.nextInt();

			for (int j = input;j >= 2;j--)
			{
				if (f.isPrime(j))
				{
					if (k == n-1)
					{
						System.out.print("Case #" + (k+1) + ": " + j);
					}
					else
					{
						System.out.println("Case #" + (k+1) + ": " + j);
					}
					break;
				}
			}
		}

		// t.end();
		// System.out.println("\n\n...elapsed time : " + t.duration() + " ms");
	}

}
