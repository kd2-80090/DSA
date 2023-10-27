package com.bubblesort;

import java.util.Arrays;

public class BubbleSortComparisions {
	
	public static int bubbleSort(int arr[],int N) {
		int count =0;
		for(int i=1;i<N;i++) {
			for(int j=0;j<N-i;j++) {
				count++;
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {20,30,40,10,50,60};
		
		System.out.println("Array Elements : Before Sorting");
		System.out.println(Arrays.toString(arr));
		
		int count = bubbleSort(arr, arr.length);
		System.out.println("No of comparisons = "+count);
		
		System.out.println("Array Elements : After Sorting");
		System.out.println(Arrays.toString(arr));
		
//		for (int i : arr) {
//			System.out.println(i);
//		}
	}
}
