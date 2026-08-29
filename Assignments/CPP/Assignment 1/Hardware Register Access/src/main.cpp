#include <iostream>
using namespace std;

int main() {

    int statusReg = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg = 0b11001010;


    const int* regPtr1 = &statusReg;
    cout << "Status Register: " << *regPtr1 << endl;
    // *regPtr1 = 123;     // Error: Cannot change the value through a pointer to const.

    int temp = 123;
    regPtr1 = &temp;   // This is valid. regPtr1 can be repoint.


    int* const regPtr2 = &controlReg;
    *regPtr2 = 55;
    cout << "Control Register: " << *regPtr2 << endl;
    //regPtr2 = &dataReg;   // Error: assignment of read-only variable 'regPtr2.


    const int* const regPtr3 = &statusReg;
    cout << "Status Register again: " << *regPtr3 << endl;
    // *regPtr3 = 100;    // Error: Assignment of read-only location '*(const int*)regPtr3'

    // regPtr3 = &dataReg; // Error: Assignment of read-only variable 'regPtr3'


    return 0;
}
