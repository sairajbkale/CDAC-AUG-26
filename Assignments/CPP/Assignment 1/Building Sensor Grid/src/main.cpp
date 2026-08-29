#include <iostream>
using namespace std;

int main() {
	double arr[3][3];
	double temp;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			cout << "Enter Floor No." << i << " and Room No. " << j << " temperature ";
			cin >> temp;
			arr[i][j] = temp;
		}
	}
	cout << "      Room1 Room2 Room3" << endl;
	for (int i = 0; i < 3; i++) {
		cout << "Floor" << i+1 << ":" ;
		for (int j = 0; j < 3; j++) {
			cout << "  " << arr[i][j] << "  ";
		}
		cout << endl;
	}

	double hot = 0;
	int floor;
	int room;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (arr[i][j] > hot) {
				hot = arr[i][j];
				floor = i;
				room = j;
			}
		}
	}
	cout << "Hottest Room :" << "Floor " << floor+1 << ", Room " << room+1 << "->" << hot << endl;

	double f1avgtemp ;
	double f2avgtemp ;
	double f3avgtemp ;
	for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==0){
					f1avgtemp = f1avgtemp + arr[i][j];
				}
				else if(i==1){
					f2avgtemp = f2avgtemp + arr[i][j];
				}
				else if(i==2){
					f3avgtemp = f3avgtemp + arr[i][j];
				}
			}
	}
		double f1avg = f1avgtemp/3;
		double f2avg = f2avgtemp/3;
		double f3avg = f3avgtemp/3;

		if(f1avg > f2avg && f1avg > f3avg){
			cout << "Hottest Floor : Floor 1 (" << f1avg <<"°C)" << endl;
		}
		else if(f2avg > f3avg){
			cout << "Hottest Floor : Floor 2 (" << f2avg <<"°C)" << endl;
		}
		else{
			cout << "Hottest Floor : Floor 3 (" << f3avg <<"°C)"<< endl;
		}
		int warning=0;
		for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						if(arr[i][j]>=30){
							warning ++;
						}
					}
		}

		cout << "Rooms at warning or above : " << warning << endl;

		return 0;

	}
