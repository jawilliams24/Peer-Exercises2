package com.qa.dogs;

import java.util.ArrayList;
import java.util.Scanner;

public class DogComp {

	public static void main(String[] args) {

		int number;
		
		ArrayList<Integer> dogs = new ArrayList<Integer>();
		
		for(int i=1;i<=100;i++) {
			dogs.add(i);
		}
		
		System.out.println("What place did your dog finish?");
		
		PlaceScan place = new PlaceScan();
		System.out.println(place.placeScanner());
		dogs.remove(PlaceScan.getNumber()-1);
		
		System.out.println(dogs);
	}


}
