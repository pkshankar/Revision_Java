package Basics_Java;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {

		int sum = 0, sumF = 0, counter = 0;
		int numArr[] = { -1, 1, 2, 3,0,-3 };
		int numArrF[] = new int[numArr.length + 1];
		Arrays.sort(numArr);
		int smallestNum = numArr[0];
		int largestNum = numArr[numArr.length - 1];
		for (int i : numArr) {

			sum = sum + i;
		}

		for (int k = smallestNum; k <= largestNum; k++) {

			numArrF[counter] = k;
			counter++;
		}

		for (int j = 0; j < numArrF.length; j++) {

			sumF = sumF + numArrF[j];

		}
		System.out.println("MISSING NUMBER : " + (sumF - sum));

	}

}
