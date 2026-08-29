#include <iostream>
using namespace std;

struct Layout1 {
    char c1;
    int i;
    char c2;
};

struct Layout2 {
    int i;
    char c1;
    char c2;
};

int main() {

    cout << sizeof(Layout1) << endl;
    cout << sizeof(Layout2) << endl;

    /*
    The sizes can be different because of padding.

    Padding is extra space added by the compiler so that members are properly aligned in memory.

    In Layout1, the int comes between two chars, so more padding may be needed.

    In Layout2, the int is first and the two chars come together, so less padding is usually needed.

    Member order matters in network packets and hardware registers because the exact memory layout is important.
    */

    return 0;
}
