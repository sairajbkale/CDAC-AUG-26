#include <iostream>
using namespace std;

int main() {
	double celsius;
	cout << "Enter Celsius ";
	cin >> celsius; // Fetching Celsius Value
	double fahrenheit = ((celsius * 9/5)+32);
	cout << "Temperature: " << celsius << "°C / " << fahrenheit << "°F" << endl;

	string statusLabel ;
	// Comparing celsius to generate status code.
	int statusCode;
	if(celsius < 0){
		statusCode = -1;
		statusLabel = "SENSOR_ERROR";
	}
	else if(celsius >= 0 && celsius <= 29){
		statusCode = 0;
		statusLabel = "NORMAL";
	}
	else if(celsius >= 30 && celsius <= 44){
		statusCode = 1;
		statusLabel = "WARNING";
	}
	else if(celsius >=45 && celsius <= 59){
		statusCode = 2;
		statusLabel = "CRITICAL";
	}
	else if(celsius >= 60){
		statusCode = 3;
		statusLabel = "SHUTDOWN";
	}

	cout << "Status :" << statusLabel << endl;
	// Generating Action based on status code.
	switch(statusCode){
	case -1:
		cout << "Action : Sensor fault- check wiring" << endl;
		break;
	case 0:
			cout << "Action : No action required"<< endl;
			break;
	case 1:
			cout << "Action : Alert sent to supervisor"<< endl;
			break;
	case 2:
			cout << "Action : Cooling system triggered"<< endl;
			break;
	case 3:
			cout << "Action : Emergency shutdown initiated"<< endl;
			break;
	}

	// Deciding temperature based on celsius using ternary operator
	cout << "Reading : " <<((celsius > 25)?"Above Average":((celsius == 25)?"Normal Operating Temperature":"Below Average"))<< endl;

	return 0;
}
