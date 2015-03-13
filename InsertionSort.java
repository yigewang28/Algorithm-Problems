
public class InsertionSort {
	
	public void sort(int[] array){
		for(int i = 1; i <= array.length - 1; i++){
			int j = i - 1;
			int temp = array[i];
			while(j >= 0 && (temp < array[j])){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp; 
		}
	}
	
	public static void main(String[] args){
		int[] array = {2,4,7,3,1,5};
		InsertionSort test = new InsertionSort();
		test.sort(array);
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

}
