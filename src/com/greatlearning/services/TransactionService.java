package com.greatlearning.services;

public class TransactionService {

	public void search(int[] transactions, long valueOfTarget) {
		
		long sum = 0;
		boolean targetAchieved = false;
		for(int i=0;i<transactions.length;i++) {
			
			sum += transactions[i];						
			if (sum >= valueOfTarget) {
				
				targetAchieved = true;
				System.out.println("Target achieved after "+(i+1)+ " transactions");
				break;
			}
		}
		
		if (!targetAchieved) {
			System.out.println("Given target is not achieved");
		}
	}
	
	/*
	public void search2(int arr[], long targetVal)
	{
		int i=0;
		while(targetVal > 0 && i < arr.length) {
			targetVal =  targetVal - arr[i];
			i++;
		}
		
		if (targetVal > 0) {
			System.out.println("no of target transaction not achieved");
		} else {
			System.out.println("no of target transaction is:" + i);
		}
	}
	*/
}