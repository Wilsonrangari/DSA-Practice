package lec_11;

public class Selection_Sort {

	public static void main(String[] args) {

		int arr[] = { 5, 3, -7, 4, 8, 2 };

		selection_Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	private static void selection_Sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;

				}

			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}

	}

}
