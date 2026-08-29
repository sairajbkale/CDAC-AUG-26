#include <iostream>
using namespace std;

int main() {
	int N;
	cout << "Enter the number of values to enter :";
	cin >> N;
	double arr[N];
	double temp;
	int count = 0;
	// Entering values in array
	for (int i = 0; i <= N-1  ; i++) {
		cout << "Enter " << i << " value:";
		cin >> temp;
		arr[i] = temp;
		count ++;
	}
	cout << "Readings Entered :" << count << endl;
	int skip = 0;
	int valid = 0;
	cout << "Valid Readings: ";
	// Reading values from array
	for (int i = 0; i <= N - 1; i++) {
		if (arr[i] < 0) {
			skip = skip + 1;  // Counting Skipped Values
			continue;
		} else {
			valid++;
			cout << arr[i] << " ";
		}
	}
	cout << endl ;
	cout << "Skipped(errors) : " << skip << endl;  // Displaying Skipped Values
	int index;
	double criticalTemp = -1;
	for (int i = 0; i <= N - 1; i++) {   // Displaying Critical Temparature
		if (arr[i] >= 45) {
			index = i;
			criticalTemp = arr[i];
			break;
		}
	}
	if(criticalTemp >=45){
	cout << "First Critical :" << "Index " << index+1 << "->" << criticalTemp <<"°C" << endl;
	}
	double min = 100;
	double max = 0;
	double total = 0;
	// Calculating Min , Max and Avg
	for (int i = 0; i <= N - 1; i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
		if(arr[i]<=0){
			continue;
		}
		else{
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		if(arr[i]<=0){
			continue;
		}
		else{
		total = total + arr[i];
		}
	}
	double average = total / valid;
	cout << "Minimum :" << min << "°C  Maximum :" << max << "°C  Average :" << average << endl;

	int normal = 0;
	int warning = 0;
	int critical = 0;
	int shutDown = 0;
	// Counting Normal , Warning , Critical and Shutdown Value
	for(int i=0;i<=N-1;i++){
		if(arr[i]>0 &&arr[i] <= 29){
			normal++;
		}
		else if(arr[i]>=30 && arr[i]<=44){
			warning++;
		}
		else if(arr[i]>=45 && arr[i]<=59){
			critical++;
		}
		else if(arr[i]>=60){
			normal++;
		}
	}
	cout << "Normal :" << normal << " Warning :" << warning << " Critical :" << critical << " ShutDown :" << shutDown << endl;

	return 0;
}
