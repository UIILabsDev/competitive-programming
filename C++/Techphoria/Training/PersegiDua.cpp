#include <iostream>
#include <cmath>

using namespace std;

void makePersegi(string ver, int x, int y, int x1, int y1, double d)
{
	if (ver == "v1")
	{
		cout << "Persegi #1" << endl;
		cout << x-d << " " << y << endl << x1-d << " " << y1 << endl;
		cout << x << " " << y << endl << x1 << " " << y1 << endl;
		cout << "Persegi #2" << endl;
		cout << x << " " << y << endl << x1 << " " << y1 << endl;
		cout << x+d << " " << y << endl << x1+d << " " << y1 << endl;
	}
	else
	{
		cout << "Persegi #1" << endl;
		cout << x << " " << y-d << endl << x << " " << y << endl;
		cout << x1 << " " << y1-d << endl << x1 << " " << y1 << endl;
		cout << "Persegi #2" << endl;
		cout << x << " " << y << endl << x << " " << y+d << endl;
		cout << x1 << " " << y1 << endl << x1 << " " << y1+d << endl;
	}
}

int main(int argc, char *argv[])
{
	double x, y, x1, y1;
	double d;

	cin >> x >> y >> x1 >> y1;

	if (x == x1)
	{
		d = abs(y-y1);
		if (y < y1)
		{
			makePersegi("v1", x, y, x1, y1, d);
		}
		else
		{
			makePersegi("v1", x, y1, x1, y, d);
		}
	}
	else if (y == y1)
	{
		d = abs(x-x1);
		if (x < x1)
		{
			makePersegi("v2", x, y, x1, y1, d);
		}
		else
		{
			makePersegi("v2", x1, y, x, y1, d);
		}
	}
	
	return 0;
}