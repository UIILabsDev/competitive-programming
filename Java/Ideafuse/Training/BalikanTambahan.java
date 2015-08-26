/*
	@problem: 10. BalikanTambahan
	@author: Nabil Muhammad Firdaus
	@created: June 9, 2015
*/

import java.util.Scanner;

public class BalikanTambahan {

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int n, results;
		String nilai, reverse;

		n = io.nextInt();

		for (int i = 0;i < n;i++)
		{
			nilai = io.next();
			reverse = "";

			for (int j = nilai.length() - 1;j >= 0;j--)
			{
				reverse = reverse + nilai.charAt(j);
			}

			results = Integer.parseInt(nilai) + Integer.parseInt(reverse);

			System.out.println(results);
		}

	}

}