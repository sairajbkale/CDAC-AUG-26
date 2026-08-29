
#include <iostream>
using namespace std;

	void resetSensorPairV1(int reading1,int reading2); // Original Bug - Call By Value
	void resetSensorPairV2(int &reading1,int &reading2); // Fix 1 - Call By Reference
	void resetSensorPairV3(int *reading1,int *reading2); // Fix 2 - Call By Pointer

	int main() {
		int a = 55;
		int b = 12;

		/* V1 - Call by Value
		 * Here we are not providing the actual parameter but a copy of them because of which
		 * whatever actions happen in the function are not reflected in the main function.
		 * Once it comes out of scope of the function , everything that happened in the function
		 * is erased . */
		cout << "--- V1: Call by Value ---" << endl;
		cout << "Before : A=" <<a<< " B = " << b << endl;
		resetSensorPairV1(a,b);
		cout << "After :  A=" <<a<< " B = " << b << endl;
		cout << endl;

		/* V2 - Call by Reference
		 * Here , we are not providing copy of parameters but a reference to those parameters
		 * which works like their alias and whatever changes are made on them inside function is
		 * reflected in main function. */
		cout << "--- V2: Call by Reference ---" << endl;
		cout << "Before : A=" <<a<< " B = " << b << endl;
		resetSensorPairV2(a,b);
		cout << "After :  A=" <<a<< " B = " << b << endl;

		cout << endl;

		/* V3 - Call by Pointer
		 * Here , we are using pointer to store the address of parameters and whatever changes are
		 * made on the pointer is directly reflected on the actual address of parameters*/
		cout << "--- V3: Call by Value ---" << endl;
		cout << "Before : A=" <<a<< " B = " << b << endl;
		resetSensorPairV3(&a,&b);
		cout << "After :  A=" <<a<< " B = " << b << endl;

		cout << endl;

		return 0;
	}

	void resetSensorPairV1(int reading1,int reading2){
		int temp = reading1;
		reading1 = reading2;
		reading2 = temp;
	}

	void resetSensorPairV2(int &reading1,int &reading2){
		int temp = reading1;
		reading1 = reading2;
		reading2 = temp;
	}

	void resetSensorPairV3(int* reading1,int* reading2){
		int temp = *reading1;
		*reading1 = *reading2;
		*reading2 = temp;
	}

