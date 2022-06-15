package BinarySearch;

public class BinarySearchCeil {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 7, 8, 9, 14 };
		int target = 10;
		int answer = binarySearCeil(arr, target);
		System.out.println(answer);
	}

// Search the index
// return the index, bascially means the value of index, basically the int value;
	private static int binarySearCeil(int[] arr, int target) {
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}

		return start;

	}

}
