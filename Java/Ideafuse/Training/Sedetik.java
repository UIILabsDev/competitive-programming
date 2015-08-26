/*
	@problem: 3. Sedetik
	@author: Nabil Muhammad Firdaus
	@created: 4 Mei 2015
*/

import java.util.Scanner;

public class Sedetik {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int jam,jamAf,menit,menitAf,detik,detikAf;

		jam = jamAf = io.nextInt();
		menit = menitAf = io.nextInt();
		detik = detikAf = io.nextInt();
		detik--;
		if (detik < 0)
		{
			detik = 59;
			menit--;
		}
		if (menit < 0)
		{
			menit = 59;
			jam--;
		}
		if (jam < 0)
		{
			jam = 23;
		}
		System.out.println(jam + ":" + menit + ":" + detik);
		detikAf++;
		if (detikAf >= 60)
		{
			detikAf = 0;
			menitAf++;
		}
		if (menitAf >= 60)
		{
			detikAf = menitAf = 0;
			jamAf++;
		}
		if (jamAf >= 24)
		{
			detikAf = jamAf = menitAf = 0;
		}
		System.out.println(jamAf + ":" + menitAf + ":" + detikAf);
	}

}