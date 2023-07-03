package com.greatlearning.driver;
import java.util.Scanner;
import com.greatlearning.services.TransactionService;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the size of transaction array");
		
		int size = scan.nextInt();
		int[] transactions = new int[size];
		
		System.out.println("enter the values of array");
		
		for(int i=0;i<size;i++) {
			transactions[i] = scan.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		
		int target = scan.nextInt();
		searchTransactions(target, transactions);
	}
	
	public static void searchTransactions(int target, int[] transactions)
	{
		TransactionService service1 = new TransactionService();
		
		while(target > 0) {
			
			System.out.println("enter the value of target");
			long valueOfTarget = scan.nextLong();	
			
			service1.search(transactions, valueOfTarget);
			target--;
		}
	}
}