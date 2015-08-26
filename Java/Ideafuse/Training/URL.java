/*
	@problem: 5. URL
	@author: Nabil Muhammad Firdaus
	@created: 4 Mei 2015
*/

import java.util.Scanner;

public class URL {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String url;
		int slash=0,dot=0,i=0;
		int[] sls,dt;
		String[] str;
		boolean hasil;
		hasil = false;
		sls = new int[255];
		dt = new int[255];
		str = new String[255];

		url = io.nextLine();

		for(String proc: url.split("", 255))
		{
			str[i++] = proc;
		}

		for (int a = 0;a < i-1;a++)
		{
			if (str[a].equals("/"))
			{
				sls[slash] = a;
				slash++;
			}
			else if (str[a].equals("."))
			{
				dt[dot] = a;
				dot++;
			}
		}

		// untuk mengecek apakah diantara .. kosong atau tidak
		// dan apakah . ada di awal dan atau akhir servis atau tidak
		if (dot >= 1)
		{
			for (int a = 0;a < dot;a++)
			{
				if (dt[a] == dt[(a+1)]-1)
				{
					hasil = true;
				}
			}
			if (slash >= 1)
			{
				if (dt[(dot-1)] == sls[(slash-1)]-1)
				{
					hasil = true;
				}
			}
			if (dt[0] == 0 || dt[(dot-1)] == i-2)
			{
				hasil = true;
			}
		}

		//untuk mengecek apakah setelah / ada . atau tidak
		if (slash > 0)
		{
			for (int a = sls[0];a < i;a++)
			{
				if (str[a].equals("."))
				{
					hasil = true;
				}
			}
		}

		if (!hasil)
		{
			System.out.println("YA");
		}
		else
		{
			System.out.println("TIDAK");
		}
	}

}