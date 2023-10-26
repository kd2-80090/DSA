package com.binarysearch;

import java.util.Scanner;

public class BinarySearchArrayDescending {

	public static int binarySearch(int arr[],int size,int key) {
		
		int left=0,right=size-1,mid;
		while(left<=right) {
			mid=(left + right)/2;
			if(key == arr[mid])
				return mid;
			else if(key<arr[mid])
				left=mid+1;
			else
				right=mid-1;
		}
		return -1;	
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int arr[]= {50,40,30,20,10};
		System.out.print("Enter key to be searched : ");
		int res = BinarySearchArrayDescending.binarySearch(arr, arr.length, sc.nextInt());
	
		if(res!=-1)
			System.out.println("Key founded in array at index : "+ res);
		else
			System.out.println("Key not founded.");
	}
}
