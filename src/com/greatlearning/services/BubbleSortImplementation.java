package com.greatlearning.services;

public class BubbleSortImplementation {
	
	public int[] reverseSort(int[] arr)
	{
		int size = arr.length;
        int temp = 0;

        for(int i=0; i<size; i++) {

            for(int j=1;j<size;j++) {

                if (arr[j-1] < arr[j]) {

                    temp = arr[j-1];
                    arr[j-1] = arr[j];                    
                    arr[j] = temp;
                }
            }

            size = size - 1;
        }
		
		return arr;
	}
}
