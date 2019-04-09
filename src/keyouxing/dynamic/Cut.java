package keyouxing.dynamic;

public class Cut {
	public int cut(int n) {
		if(n<2) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		if(n == 3) {
			return 2;
		}
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for(int i=4; i<=n; i++) {
			int max = 0;
			for(int j=1; j <= i/2; j++) {
				int temp = dp[j] * dp[i-j];
				if(max<temp) {
					max = temp;
				}
			}
			dp[i] = max;
		}
		return dp[n];
	}
}
