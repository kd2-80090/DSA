package com.linearsearch;

import java.util.Scanner;

public class LinearSearchNOccurence {

	public static int linearSearch(int arr[],int key,int noOfOccurence) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				count++;
				if(count==noOfOccurence)
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int arr[] = {22,44,33,77,55,66,22,11,88,22};
		
		System.out.println("Enter nth occurance number of 22 to be checked :");
		int nthOccurence = sc.nextInt();
		
		int res = LinearSearchNOccurence.linearSearch(arr, 22, nthOccurence );
		
		System.out.println(nthOccurence+" Number of occurence of 22 is at index : "+res);
	}
}
