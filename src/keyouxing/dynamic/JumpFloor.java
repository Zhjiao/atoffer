package keyouxing.dynamic;

public class JumpFloor{
	
	public int jumpFloor(int target) {
		if(target == 1 || target == 2) {
			return target;
		}
		int[] dp = new int[target];
		dp[0] = 1; dp[1] = 2;
		for(int i=2; i<dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[target-1];
	}

}
