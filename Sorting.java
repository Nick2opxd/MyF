package com.nick.sorting;

public class Sorting {

	public static void main(String[] args) {
		int arr[]= {22,178,6,88,44,99};
		System.out.print("Before sorting: ");
		for(int num:arr) {
			System.out.print(num+ " ");
		}
		bubbleSort(arr);
		System.out.println();
		System.out.print("After sorting: ");
		System.out.print("Sorted Array");
		for(int num:arr) {
			System.out.print(num+ " ");
		}
		

	}
	public static void bubbleSort(int arr[]) {
		int size=arr.length;
		int temp=0;
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
