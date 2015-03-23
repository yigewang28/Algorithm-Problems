public class BinarySearch {
	public int search (int[] array, int target, int start, int end) {
		//if(array == null) return -1;
		if(start == end) return array[start] == target ? start : -1;
		if(start > end) return -1;
		int mid = (start + end) / 2;
		if(array[mid] == target) return mid;
		if(arrat[mid] > target) search(array, target, start, mid);
		else search(array, target, mid+1, end);
	}

	public int binarySearch(int array, int target) {
		if(array == null) return -1;
		return search(array, target, 0, array.length-1);
	}
}