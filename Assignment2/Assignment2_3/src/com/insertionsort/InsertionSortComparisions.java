package com.insertionsort;

import java.util.Arrays;

public class InsertionSortComparisions {
	
	public static int insertionSort(int arr[],int N) {
		int count=0;
		for(int i=1;i<N;i++) {
			int temp = arr[i];
			int j=i-1;
			count++;
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[]= {20,30,40,10,50,60};
		
		System.out.println("Array Elements : Before Sorting");
		System.out.println(Arrays.toString(arr));
		
		int count = insertionSort(arr, arr.length);
		System.out.println("No of comparisons = "+count);
		
//		insertionSort(arr, arr.length);
		System.out.println("Array Elements : After Sorting");
		System.out.println(Arrays.toString(arr));
		
//		for (int i : arr) {
//			System.out.println(i);
//		}
	}
}
