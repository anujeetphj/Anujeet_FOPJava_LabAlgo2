package com.greatlearning.services;

public class DenominationService {
	
	public void getDenominations(int[] denominations, int amount)
	{
		int[] notesCount = new int[denominations.length];
		
		for (int i=0;i<denominations.length;i++) 
		{
			if (amount >= denominations[i]) {
				
				try {
					
					notesCount[i] = amount / denominations[i];					
				
				} catch (ArithmeticException e) {
					
					
				}
				
				amount = amount - (notesCount[i] * denominations[i]);
			} else {
				
				notesCount[i] = 0;
			}
		}
		
		if (amount > 0) {
			
			System.out.println("Cannot pay the amount with highest denomination");
		} else {
			
			System.out.println("Amount paid with:");
			for(int k=0;k<notesCount.length;k++) {
				
				if (notesCount[k] > 0) {
					System.out.println(denominations[k]+" "+notesCount[k]);
				}
			}
		}
	}
}
