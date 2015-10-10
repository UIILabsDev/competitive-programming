#include <iostream>

using namespace std;

void persegi(string arah, int& x, int& y, int d)
{
	if (arah == "kanan")
	{
		x += d;
		cout << x << " " << y;
	}
	else if (arah == "atas")
	{
		y += d;
		cout << x << " " << y;
	}
	else if (arah == "kiri")
	{
		x -= d;
		cout << x << " " << y;
	}
	else if (arah == "bawah")
	{
		y -= d;
		 cout << x << " " << y;
	}
}

void makePersegi(string arah[4][3], int x, int y, int d)
{
	int tempX, tempY, tempD;
	tempX = x; tempY = y; tempD = d;
	for (int i = 0; i < 4; i++)
	{
		cout << "Persegi #" << (i+1) << endl;
		cout << x << " " << y << endl;
		for (int j = 0; j < 3; j++)
		{
			persegi(arah[i][j], x, y, d);
			cout << endl;
		}
		x = tempX; y = tempY; d = tempD;
	}
}

int main(int argc, char *argv[])
{
	int x, y, d;
	string arah[4][3] = {
		{"kanan", "atas", "kiri"},
		{"atas", "kiri", "bawah"},
		{"kiri", "bawah", "kanan"},
		{"bawah", "kanan", "atas"}
	};

	cin >> x >> y >> d;

	makePersegi(arah, x, y, d);
	
	return 0;
}