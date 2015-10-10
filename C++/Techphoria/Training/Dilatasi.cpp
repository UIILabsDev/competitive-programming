#include <iostream>
#include <cmath>

using namespace std;

int main(int argc, char *argv[])
{
	double x, y, x1, y1;
	double dx, dy;

	cin >> x >> y >> x1 >> y1;

	dx = abs(x-x1);
	dy = abs(y-y1);

	if (x+dx == x1)
	{
		x1 += dx;
	}
	else
	{
		x1 -= dx;
	}
	if (y+dy == y1)
	{
		y1 += dy;
	}
	else
	{
		y1 -= dy;
	}

	cout << x1 << " " << y1 << endl;
	
	return 0;
}