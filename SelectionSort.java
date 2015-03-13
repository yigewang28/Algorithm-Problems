public class SelectionSort {
	
	public void sort(int[] array){
		for(int i = 0; i <= array.length - 2; i++){
			int min = i;
			for(int j = i+1; j <= array.length - 1; j++){
				if(array[j]<array[min]) min = j;
			}
			if(min != i){
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp; 
			}
		}
	}
	
	public static void main(String[] args){
		int[] array = {3,2,7,0,1,5};
		SelectionSort test = new SelectionSort();
		test.sort(array);
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

}