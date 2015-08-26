import java.util.Scanner;

public class PowerCrisis {

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);

		int n, m, counter = 0, count = 0, data = 0;

		n = io.nextInt();
		m = io.nextInt();

		int[] off = new int[n];

		for (int i = 0;i < n;i++)
		{
			if (i == 0)
			{
				off[i] = 1;
			}
			else
			{
				off[i] = 0;
			}
		}

		for (int i = 0;i < n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				for (int k = 0;k < n;k++)
				{
					if (j == off[k])
					{
						counter--;
					}
				}

				data = j;
				if (counter == m) break;
			}

			if (count < n)
			{
				count++;
				off[count] = data;
				counter = 0;
			}

			//1,6,11,16,5,12,2,9,17,10,4,15,14,3,8,13,7.

			System.out.print(off[i]);
			if (i != n - 1)
			{
				System.out.print(", ");
			}
		}

	}

}