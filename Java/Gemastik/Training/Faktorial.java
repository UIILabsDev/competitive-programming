/*
	@problem: Faktorial
	@author: Nabil Muhammad Firdaus
	@created: August 8, 2015
	@edited: August 10, 2015
*/

import java.util.Scanner;

public class Faktorial
{

	public long faktorize(int angka)
	{
		if (angka == 1)
		{
			return 1;
		}
		else
		{
			return angka * this.faktorize(angka-1) % 1009;
		}
	}

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		Faktorial f = new Faktorial();
		int angka;
		angka = io.nextInt();

		System.out.println(f.faktorize(angka));
	}

}