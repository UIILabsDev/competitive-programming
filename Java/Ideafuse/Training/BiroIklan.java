/*
	@problem: 7. BiroIklan
	@author: Nabil Muhammad Firdaus
	@created: 4 Mei 2015
*/

import java.util.Scanner;

public class BiroIklan {

	public static void main(String[] args) {

		Scanner io = new Scanner(System.in);
		int req, tolak = 0;
		int[] noBill;
		boolean ditempati;

		req = io.nextInt();
		noBill = new int[req];

		for (int i=0;i < req;i++)
		{
			noBill[i] = io.nextInt();
			if (i != 0)
			{
				ditempati = false;
				for (int k=0;k < i;k++)
				{
					if (noBill[i] == noBill[k])
					{
						ditempati = true;
					}
				}
				if (ditempati)
				{
					tolak++;
				}
			}
		}

		System.out.println(tolak);
	}

}