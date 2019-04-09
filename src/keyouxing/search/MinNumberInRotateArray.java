package keyouxing.search;

public class MinNumberInRotateArray {
	
	public int minNumberInRotateArray(int [] array) {
		if(array == null || array.length == 0){
			return 0;
		}
		int left = 0;
		int right = array.length-1;
		int middle = 0;
		while(array[left] >= array[right]) {
			if(right - left == 1) {
				middle = right;
				break;
			}
			middle = (right - left)/2;
			
			if(array[middle] >= array[left]) {
				left = middle; 
			}else {
				right = middle;
			}
		}
		return array[middle];
	}
}
