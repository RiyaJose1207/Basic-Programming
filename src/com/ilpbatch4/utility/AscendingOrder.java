package com.ilpbatch4.utility;

public class AscendingOrder {

	public static void main(String[] args) {
		int array[] = { 7, 4, 8, 10 };
		ascendingOrder(array);
	}

	private static void ascendingOrder(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

}
