package com.greatlearning.driver;
import java.util.Scanner;

import com.greatlearning.services.BubbleSortImplementation;
import com.greatlearning.services.DenominationService;

public class CurrencyMain {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the size of currency denominations");
		
		int size = scan.nextInt();
		int[] denominations = new int[size];
		
		System.out.println("enter the currency denominations value");
		
		for(int i=0;i<size;i++) {
			denominations[i] = scan.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		
		int amountToPay = scan.nextInt();
		
		BubbleSortImplementation service1 = new BubbleSortImplementation();
		denominations = service1.reverseSort(denominations);
				
		DenominationService service2 = new DenominationService();
		service2.getDenominations(denominations, amountToPay);
	}

}
