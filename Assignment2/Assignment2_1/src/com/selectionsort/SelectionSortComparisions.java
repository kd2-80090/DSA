package com.selectionsort;

import java.util.Arrays;

public class SelectionSortComparisions {
	public static int selectionSort(int arr[],int N) {
		int count=0;
		for(int i=0;i<=N-1;i++) {
			for(int j=i+1;j<N;j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {20,30,40,10,50,60};
//		int arr[] = {24,120,72,240,96,48,144,216,192,168};

		System.out.println("Array Elements : Before Sorting");
		System.out.println(Arrays.toString(arr));
		

		int count = selectionSort(arr, arr.length);
		System.out.println("No of comparisons = "+count);
		
		System.out.println("Array Elements : After Sorting");
		System.out.println(Arrays.toString(arr));
		
//		for (int i : arr) {
//			System.out.println(i);
//		}
	}
}
