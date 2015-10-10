import java.util.Scanner;

public class NilaiSel {

	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int x, y, tempX, tempY, hasil;
		int[][] data;

		x    = io.nextInt();
		y    = io.nextInt();
		data = new int[x][y];
		tempX = x;

		for (int i = 0;i < x;i++)
		{
			for (int j = 0;j < y;j++)
			{
				data[i][j] = io.nextInt();
			}	
		}

		for (int i = 0;i < x;i++)
		{
			for (int j = 0;j < y;j++)
			{
				hasil = data[i][j] * (j+1) + tempX;
				if (j != y-1)
				{
					System.out.print(hasil + " ");
				}
				else
				{
					System.out.print(hasil);
				}
			}
			tempX--;
			System.out.println();
		}
	}

}