package com.algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int arr[], int size, int key) {
		int count=0;
		int left= 0,right=size-1,mid;
		while(left<=right) {
			mid = (left+right)/2;
			if(key==arr[mid])
				return ++count;
			else if(key<arr[mid])
				right = mid-1;
			else 				//(key>arr[mid])
				left = mid+1;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {

		int arr[] = {11,22,33,44,55,66};

		System.out.println("Enter key to be searched : ");
		int key = new Scanner(System.in).nextInt();
		
		int res = binarySearch(arr, arr.length, key);
		System.out.println("Number of comparisons done using Binary Search : "+res);
		
	}
}
