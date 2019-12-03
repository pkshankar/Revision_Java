package Basics_Java;

public class SmallestAndLargest {

	public static void main(String[] args) {

		int num[] = { -100, -24, -50, 88, -987656,0 };
		// System.out.println("LARGEST NUMBER : " + findLargest(num));
		// System.out.println("SMALLEST NUMBER : " + findSmallest(num));
		
		System.out.println(findOccurence("The rains have started here selenium"));

	}

	public static int findLargest(int[] numArr) {

		int largest = numArr[0];
		for (int i = 1; i < numArr.length; i++) {

			if (numArr[i] > largest) {

				largest = numArr[i];

			}
		}

		return largest;
	}

	public static int findSmallest(int[] numArr) {

		int smallest = numArr[0];
		for (int i = 1; i < numArr.length; i++) {

			if (numArr[i] < smallest) {

				smallest = numArr[i];

			}
		}

		return smallest;

	}
	
	public static int findOccurence(String str) {
		
		int ind = str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1);
		
		return ind;
	}

}
