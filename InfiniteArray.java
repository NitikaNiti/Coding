package BinarySearch;

public class InfiniteArray {

	public static void main(String[] args) {
		
	}
	static int findingRange(int arr[], int target) {
		int start = 0;
		int end = 1;
		
		while(target>arr[end]) {
				int newStart = end+1;
				end = end +(end - start +1) *2;		
					start = newStart;
		}
		return binarySear(arr,target,start,end);
	}
		
	
	// return the index, bascially means the value of index, basically the int value;
		private static int binarySear(int[] arr, int target, int start,int end) {
			
			while (start <= end) {
				int mid = start + (end - start ) / 2;
				if (target > arr[mid]) {
					start = mid + 1;
				} else if (target < arr[mid]) {
					end = mid - 1;
				} else {
					return mid;
				}
			}

			return -1;
					
}}
