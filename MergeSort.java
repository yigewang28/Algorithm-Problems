public class MergeSort {

	public void mergeSort(int[] array) {
		if(array == null || array.length <= 1)
			return;
		sort(array, 0, array.length - 1);
	}

	public void sort(int[] array, int start, int end) {
		if(start >= end) return;
		int mid = (start + end) / 2;

		sort(array, start, mid);
		sort(array, mid + 1, end);

		int left = start;
		int right = mid + 1;
		int index = start;

		int[] temp = new int[array.length];
		while(left <= mid || right <= end) {
			if(right > end || (left <= mid && array[left] < array[right])){
				temp[index] = array[left];
				index ++;
				left ++;
			}
			else {
				temp[index] = array[right];
				index ++;
				right ++;
			}
		}

		for(int i = start; i <= end; i++)
			array[i] = temp[i];
	}
}