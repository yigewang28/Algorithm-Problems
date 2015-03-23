public class BubbleSort {
	
	public void bubbleSort(int[] array) {
		if(array == null || array.length <= 1) 
			return;

		for(int i = 0; i <= array.length-2; i++) {
			for(int j = i; j <= array.length-1; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

	}

}