public class BinarySearchLocation {
	
	public int search (int[] array, int target, int start, int end) {
		if(start == end) {
			if(array[start] == target) return start;
			else if(array[start] > target) {
				int index = start;
				while(index >= 0 && array[index] > target)
					index --;
				return index + 1;
			}
			else {
				int index = start;
				while(index <= end && array[index] < target) 
					index ++;
				return index;
			}
		}
		int mid = (start + end) / 2;
		if(array[mid] == target) return mid;
		else if(array[mid] > target) return search(array, target, start, mid);
		else return search(array, target, mid + 1, end);
	}
	
	public int binarySearch(int[] array, int target){
		if(array == null) return -1;
		return search(array, target, 0, array.length - 1);
	}
	
	public static void main(String[] args) {
		BinarySearchLocation test = new BinarySearchLocation();
		int[] array = {1,3};
		int target = 0;
		System.out.println(test.binarySearch(array, target));
	}
}