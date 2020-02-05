package com.qa.dogs;

import java.util.Scanner;

public class PlaceScan {

	static int number;
	
	public static Integer placeScanner() {
		
	
	Scanner placeScanner = new Scanner(System.in);
	number = placeScanner.nextInt();
	Integer number = PlaceScan.number;
	
	return number;
	
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		PlaceScan.number = number;
	}

	
}
	
