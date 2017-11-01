package com.assignments;

public class Session9Class {
	private int inputNumber;

	// Trying use below constructor input for two methods
	Session9Class(int inputNumber) {
		this.inputNumber = inputNumber;
	}

	void findingPrimeNumber() {

		double reminder;
		// loop to the n input numbers
		for (int j = 1; j <= inputNumber; j++) {
			int divideCount = 0;
			// If any number divide by 1 and itself only then we call it as a
			// prime number 2-9
			for (int i = 1; i <= 9; i++) {
				reminder = j % i;

				if (reminder == 0) {
					divideCount++;

				}

			}
			// Below clause is for finding prime number for single digit number
			// 1 to 9
			if (j > 0 && j <= 9 && divideCount == 2) {
				System.out.println(j);

			} else if (j > 9 && divideCount == 1) {
				System.out.println(j);

			}

		}
	}

	// calculation for WindowSeat
	private double wsCal;
	private double wsCal1;
	// calculating for Aisle Seat
	private double asCal;
	private double asCal1;

	void seatPosition() {

		if (inputNumber == 1) {
			wsCal = 0;
		} else {
			wsCal = (inputNumber % 6);
			wsCal1 = ((inputNumber - 1) % 6);
		}
		if (inputNumber == 4) {
			asCal = 0;
		} else {
			asCal = (inputNumber % 3);
			asCal1 = ((inputNumber - 1) % 3);
		}
		if (wsCal == 0 || wsCal1 == 0) {
			System.out.println("Facing of the  seat number " + inputNumber + " is : WS");

		} else if (wsCal != 0 && wsCal1 != 0 && (asCal == 0 || asCal1 == 0)) {
			System.out.println("Facing of the  seat number  " + inputNumber + " is : AS");
		} else {
			System.out.println("Facing of the  seat number  " + inputNumber + " is : MS");
		}

	}
	// Facebook photo upload status method

	void photoUploadStatus(double l, double w, double h) {
		if (l < w || l < h) {
			System.out.println("UPLOAD ANOTHER");
		} else if (l == w && l == h) {
			System.out.println("ACCEPTED");
		} else {

			System.out.println("CROP IT");
		}

	}

	void seatLogic() {
		int seatNumber = 59;
		if (seatNumber % 6 == 0 || seatNumber % 6 == 1) {
			System.out.println("Window side");
		} else if (seatNumber % 6 == 2 || seatNumber % 6 == 5) {
			System.out.println("Middle seat");
		} else {
			System.out.println("Aisle seat");
		}
	}
}