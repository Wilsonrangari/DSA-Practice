package lec_11;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr = { 20, 13, -4, 5, 7 };
		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length - 1 - j; i++) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
