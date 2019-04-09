package keyouxing.sort;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
		int length = arr.length;
		boolean change = true;
		for(int i=0; i<length-1&&change == true; i++) {
			change = false;
			for(int j=0; j<length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					change = true;
				}
			}
		}
	}
}
