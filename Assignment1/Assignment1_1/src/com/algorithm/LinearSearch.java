package com.algorithm;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[],int size,int key) {
		int count=0;
		for(int i=0;i<=size-1;i++) {
			if(key==arr[i])
				return ++count;
			else
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {11,22,33,44,55,66};
		System.out.println("Enter key to be searched : ");
		int key = new Scanner(System.in).nextInt();
		
		int res = linearSearch(arr, arr.length, key);
		System.out.println("Number of Comparisons done by LinearSearch  = " +res);
		
	}
}

