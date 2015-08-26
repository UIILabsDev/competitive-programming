import java.util.Scanner;

public class RataKiri
{

	public int[] makeRataKiri(int[] data)
	{
		int temp;
		for (int i = 0;i < data.length;i++)
		{
			for (int j = 0;j < data.length-1;j++)
			{
				if (data[j] == 0)
				{
					temp = data[j];
					data[j] = data[(j+1)];
					data[(j+1)] = temp;
				}
			}
		}

		return data;
	}

	public static void main(String[] args)
	{
		RataKiri rk = new RataKiri();
		Scanner io = new Scanner(System.in);
		int range;
		int[] data;

		range = io.nextInt();

		data = new int[range];

		for (int i = 0;i < range;i++)
		{
			data[i] = io.nextInt();
		}

		data = rk.makeRataKiri(data);

		for (int i = 0;i < range;i++)
		{
			if (i != range-1)
			{
				System.out.print(data[i] + " ");
			}
			else
			{
				System.out.println(data[i]);
			}
		}

	}

}