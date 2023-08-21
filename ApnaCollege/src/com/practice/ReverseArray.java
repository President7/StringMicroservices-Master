package com.practice;

public class ReverseArray {

	public static void reverseArray(int arr[])
	{
		
		//	String arr[]= {"ram","hanuman","angad"};		
			int start=0;
			int end= arr.length-1;
			for(int i=end; i>=0; i--)
			{
				System.out.print(arr[i] + " ");
			}
			
	}
	
	public static void reverseArrayWhileLoop(int arr[])
	{
		int start= 0;
	    int end= arr.length-1;

		while(start< end)
		{
			int temp= arr[arr.length-1];
			arr[end] =arr[start];
			arr[start]= temp;
			start++;
			end++;
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 2, 4, 6, 7, 8, 9 };
	//	reverseArray(arr);
		reverseArrayWhileLoop(arr);
		for(int i =0 ; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
