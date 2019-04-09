package keyouxing.bit;

public class NumberOfOne {
	
	public int numberOfOne(int n) {
		
		int flag = 1;
		int count = 0;
		while(flag != 0) {
			if((n & flag) != 0) {
				count++;
			}
			flag = flag<<1;
		}
		return count;
		
	}
}
