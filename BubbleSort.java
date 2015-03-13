

public class BubbleSort {
	
	public void bubble(int[] array) {
		if(array == null || array.length == 1) return;
		for(int i = 0; i <= array.length - 2; i++){
			for(int j = i+1; j <= array.length - 1; j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}	
			}
		}
	}
	
	public void bubble2(int[] array){
		if(array == null || array.length == 1) return;
		for(int i = array.length - 1; i >= 0; i--){
			for(int j = 0; j <= i-1; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] array = {3,2,7,0,1,5};
		BubbleSort test = new BubbleSort();
		test.bubble(array);
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		
		int[] array2 = {3,2,7,0,1,5};
		test.bubble2(array2);
		for(int i = 0; i < array2.length; i++)
			System.out.print(array2[i] + " ");

	}

}
