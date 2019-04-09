package keyouxing.sort;

public class SimpleSort {
	
	public void simpleSort(int[] arr) {
		int length = arr.length;
		
		int minIndex, temp;
		for(int i=0; i<length-1; i++) {
			minIndex = i;
			for(int j = i+1; i<length; j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
}
