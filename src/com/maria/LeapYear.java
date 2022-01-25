package com.maria;

public class LeapYear {

	public static void main(String[] args) {
		// by 4 && not by 100
		// by 400
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		
		System.out.println("****************");
		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));
		
	}
	
	// check input
	public static boolean isValidInput(int theYear) {
		if(theYear<10000 && theYear>0) {
			return true;
		}
		return false;
	}
	
	
	public static boolean isLeapYear(int theYear) {
		
		if(isValidInput(theYear)) {
			if(theYear % 400 == 0 ) {
				return true;
			}
			if((theYear % 4 == 0) && (theYear % 100 != 0)) {
				return true;
			}
		}
		return false;
	}
	
	public static int getDaysInMonth(int theMonth, int theYear) {
		
		if (isValidInput(theYear)) {
			switch (theMonth) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:  
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				if(isLeapYear(theYear)) {
					return 29;
				}
				return 28;
			default:
				return -1;
			}
		}
		return -1;
		
		
	}

}
