package com.in28mins.ifstatement.examples;

public class dateResults {
	private int dayNumber;
	private int monthNumber;
	
	
	public boolean isWeekDay(int dayNumber) {
		this.dayNumber = dayNumber;
		switch(dayNumber) {
		case 0: return false;
		case 1: return true; 
		case 2: return true; 
		case 3: return true; 
		case 4: return true; 
		case 5: return true; 
		case 6: return false; 
		default: return false; 
		}
	}
	
	public String determineNameOfMonth(int monthNumber) {
		this.monthNumber = monthNumber;
		String month;
		switch(monthNumber) {
		case 1: month = "January"; break;
		case 2: month = "February"; break;
		case 3: month = "March"; break;
		case 4: month = "April"; break;
		case 5: month = "May"; break;
		case 6: month = "June"; break;
		case 7: month = "July"; break;
		case 8: month = "August"; break;
		case 9: month = "September"; break;
		case 10: month = "October"; break;
		case 11: month = "November"; break;
		case 12: month = "December"; break;
		default: month = "Invalid month"; break;
		}
		return month;
	}
	
	public String determineNameOfDay(int dayNumber) {
		this.dayNumber = dayNumber;
		String weekDay;
		switch(dayNumber) {
		case 0: weekDay = "Sunday";break;
		case 1: weekDay = "Monday";break;
		case 2: weekDay = "Tuesday";break;
		case 3: weekDay = "Wednesday";break;
		case 4: weekDay = "Thursday";break;
		case 5: weekDay = "Friday";break;
		case 6: weekDay = "Saturday";break;
		default: weekDay = "Invalid Day";break;	
		}
		return weekDay;
	}
	
	
	

}
