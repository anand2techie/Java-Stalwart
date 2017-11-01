package com.smartcoders.sample;

public class PrintingNumbersPattern {
	// setting variable to pass the intput value to main method
	public int inputVlaue1;

	public void numberPattern(int inputNumber) {

		inputVlaue1 = inputNumber;

		for (int i = 1; i <= inputNumber; i++) {
			System.out.println("");
			int rowStartingNum = 0;
			// trying to find the starting point for each row
			for (int k = 1; k <= i; k++) {
				rowStartingNum = rowStartingNum + k;
			}
			// formula to find starting number for each row
			int m = (rowStartingNum - i) + 1;
			for (int j = m; j < m + i && j <= inputNumber; j++) {
				System.out.print(j + " ");
			}

		}

	}

	void printNumberSeries(int inputNumber) {
		int noOfElementsInALine = 1;
		int firstElementInARow = 1;
		for (int i = 1; i <= inputNumber; i = firstElementInARow) {
			for (int k = i; k < i + noOfElementsInALine; k++) {
				if (k > inputNumber) {
					break;
				}
				System.out.print(k + " ");
				firstElementInARow++;
			}
			System.out.println();
			noOfElementsInALine++;
		}
	}

}