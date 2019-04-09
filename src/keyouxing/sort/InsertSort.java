package keyouxing.sort;

public class InsertSort {

	public void insertSort(int[] arr) {
		
		for(int i =1; i<arr.length; i++) {
			int preIndex = i-1;
			int current = arr[i];
			while(preIndex > 0 && arr[preIndex] > current) {
				arr[preIndex+1] = arr[preIndex];
				preIndex--;
			}
			arr[preIndex+1] = current;
		}
		
	}
}
