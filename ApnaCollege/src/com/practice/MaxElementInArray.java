package com.practice;

public class MaxElementInArray {
	public static int maxElement(int arr[]) {
		int maxArray = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if(maxArray < arr[i])
				maxArray= arr[i];
		}
	return maxArray;
	}

	public static void main(String[] args) {
		int arr[] = { 44, 5, 6, 7, 2, 4 };
		System.out.println("The max EMlemt is = " + maxElement(arr));
	}

}
