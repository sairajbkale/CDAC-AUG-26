import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateFunctions {
	private int day = 18 ;
	private int month = 9;
	private int year = 2026;
	private int newDay ;
	private int newMonth ;
	private int newYear ;
	
	// Setting Date
	void setDate(int dd,int mm,int yyyy) {
		if(mm<1 || mm>12) {
			month= 1;
		}
		else {
			month = mm;
		}
		if(yyyy<1999 || yyyy>2999) {
			year = 2000;
		}
		else {
			year = yyyy;
		}
		if(month==1||month==3||month==5||month==7||month==8||month == 10||month ==12) {
			if(dd<1||dd>31) {
				day = 1;
			}
			else {
				day = dd;
			}
			}
		else if(month==4||month==6||month==9||month==11) {
			if(dd<1||dd>30) {
				day = 1;
			}
			else {
				day = dd;
			}
		}
		if(month==2 && ((year%4==0 && year%100!=0)||(year%400==0))){
			if(dd<1||dd>29) {
				day = 1;
			}
			else {
				day = dd;
			}
		}
		else if(month==2 && ((year%4!=0 || year%100==0)||(year%400!=0))) {
			if(dd<1||dd>28) {
				day = 1;
			}
			else {
				day = dd;
			}
		}
	}
	
	
	// Adding Date
	void addDays(int dd) {
		day = day + dd;
		if(month==1||month==3||month==5||month==7||month==8||month == 10||month ==12) {
			while(day>31) {
				day = day - 31;
				month++;
			}
		}
		else if(month==4||month==6||month==9||month==11) {
			while(day>30) {
				day = day-30;
				month++;
			}
		}
		else if(month==2 && ((year%4==0 && year%100!=0)||(year%400==0))) {
			while(day>29 && month==2) {
				day = day-29;
				month++;
			}
		}
		else {
			while(day>28 && month==2) {
				day = day-28;
				month++;
			}
		}
		if(month<1||month>12) {
			month = 1;
			year++;
		}
		if(year<1999 || year>2999) {
			year = 2000;
		}
	}
	
	// Adding Months
	void addMonths(int mm) {
		month = month+mm;
		if(month<1 || month>12) {
			month = 1;
			year++;
		}
		if(month==2 && ((year%4==0 && year%100!=0)||(year%400==0))) {
			if(day<1 || day>29) {
				day = 1;
			}
		}
		else if(month==2 && ((year%4!=0 && year%100==0)||(year%400!=0))) {
			if(day<1 || day>28) {
				day = 1;
			}
		}
	}
	
	
	// Adding Years
	void addYears(int yyyy) {
		year = year+yyyy;
		if(year<1999 || year>2999) {
			year = 2000;
		}
	}
	
	
	// Displaying Result
	void display() {
		System.out.println(day+"/"+month+"/"+year);
	}
	
	void compareDate(int dd,int mm,int yyyy) {
		newDay = dd;
		newMonth = mm;
		newYear = yyyy;
		if(mm==1||mm==3||mm==5||mm==7||mm==8||mm == 10||mm ==12) {
			if(dd<1||dd>31) {
				newDay = 1;
			}
			else {
				newDay = dd;
			}
		}
		else if(mm==4||mm==6||mm==9||mm==11) {
			if(dd<1||dd>30) {
				newDay = 1;
			}
			else {
				newDay = dd;
			}
		}
		if(mm<1 || mm>12) {
			newMonth = 1;
		}
		else {
			newMonth = mm;
		}
		if(yyyy<1999 || yyyy>2999) {
			newYear = 2000;
		}
		else {
			newYear = yyyy;
		}
	System.out.println("Entered Date :"+day+"/"+month+"/"+year);
	System.out.println("New Date :"+newDay+"/"+newMonth+"/"+newYear);
	
	LocalDate date1 = LocalDate.of(year,month,day);
	LocalDate date2 = LocalDate.of(newYear,newMonth,newDay);
	
	long difference = ChronoUnit.DAYS.between(date1,date2);
	System.out.println(difference + " Days Difference");
	}
	

	
}
