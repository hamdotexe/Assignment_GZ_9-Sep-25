#include <iostream>
#include <string>

using namespace std;

class CLASS {

private:

	int num;
	float flt;
	string str;

public:
	CLASS(int num, float flt, string str) : num(num), flt(flt), str(str) {}
	
	void display() {
		cout << "Number: " << num << ", Float: " << flt << ", String: " << str << endl;
	}

	CLASS operator+(CLASS& secondobj) 
		{
		return CLASS(num + secondobj.num, flt + secondobj.flt, str + secondobj.str);
		};

	CLASS operator-(CLASS& secondobj) 
		{
		if (str.find(secondobj.str) != string::npos) 
			return CLASS(num - secondobj.num, flt - secondobj.flt, str.erase(str.find(secondobj.str), secondobj.str.length()));
		else
			return CLASS(num - secondobj.num, flt - secondobj.flt, str);
		};

};

int main()
{
    CLASS obj1(0, 0, "Avada");
	CLASS obj2(5, 15.5, "Kadavra");
	CLASS obj3 = obj1 + obj2;

	cout << "Object 1: \n";
	obj1.display();

	cout << "Object 2: \n";
	obj2.display();

	cout << "Object 3 (Result of Addition): \n";
	obj3.display();
	return 0;
}