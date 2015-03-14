
public class MergeSort {
	
	public void sort(int[] array){
		if(array == null || array.length <= 1)
			return;
		
		merge(array, 0, array.length-1);
		
	}
	
	public void merge(int[] array, int start, int end){
		int mid = (start + end) / 2;
		if(start >= end) return;
		merge(array, start, mid);
		merge(array, mid+1, end);
		int[] temp = new int[array.length];
		int left = start;
		int right = mid + 1;
		int index = start;
		while(left <= mid || right <= end){
			if(right > end || (left <= mid && array[left] < array[right])){
				temp[index] = array[left];
				left ++;
				index ++;
			}
			else{
				temp[index] = array[right];
				right ++;
				index ++;
			}
		}
		
		for(int i = start; i <= end; i++){
			array[i] = temp[i];
		}
	}
	
	public static void main(String[] args){
		int[] array = {3,2,1,5,6,0};
		MergeSort test = new MergeSort();
		test.sort(array);
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
