package com.rank.streamofinteger;

import java.util.Scanner;

public class RankInStreamOfIntegers {

	
	public static int linearSearch(int arr[],int key) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]<=key) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter key to get rank : ");
		int key = new Scanner(System.in).nextInt();
		int res = RankInStreamOfIntegers.linearSearch(arr, key);
		
		System.out.println("Rank of "+key +" is : "+res);
	}
}
