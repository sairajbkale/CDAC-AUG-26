
#include <iostream>
using namespace std;

int main(int argc,char* argv[]) {
	if(argc<4){
		cout << "Usage : ./sensor_monitor <warn_threshold> <critical_threshold> <num_readings>" << endl;
		cout << "Error : Missing Arguments."<<endl;
		return 1;
	}
	int warn = stoi(argv[1]);
	int critical = stoi(argv[2]);
	int reading = stoi(argv[3]);

	if(warn<critical && reading >=1 && reading <=500){
	int readings[reading];

	for(int i=1;i<=reading;i++){
		readings[i]= rand()%70;
	}

	cout << "Config : Warn = " << warn << "°C  Critical = "<< critical << "°C  Readings = " << reading << endl;
	int normal=0,warning=0,critical=0,shutdown=0;
	for(int i = 0;i<=(sizeof(readings)/sizeof(readings[0]));i++){
		if(readings[i]>=0 && readings[i] <=29){
			normal++;
		}
		else if(readings[i]>=30 && readings[i] <=44){
			warning++;
		}
		else if(readings[i]>=45 && readings[i] <=59){
			critical++;
		}
		else if(readings[i]>=60){
			shutdown++;
		}
	}
	cout << "Results : Normal : " << normal << " Warnings : "<< warning  << " Critical : " << critical << " Shutdown : " << shutdown << endl;
	}
	return 0;
}
