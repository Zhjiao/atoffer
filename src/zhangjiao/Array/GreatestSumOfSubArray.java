package zhangjiao.Array;

public class GreatestSumOfSubArray {

    //{6, -3, -2, 7, -15, 1, 2, 2}连续子数组的最大和为 8（从第 0 个开始，到第 3 个为止）
    public int FindGreatestSumOfSubArray(int[]nums){
        if(nums==null||nums.length==0)
            return 0;
        int greatestSum=Integer.MAX_VALUE;  //取整数的 最小值
        int sum=0;
        for(int val:nums){
            // 如果当前和小于等于0，就重新设置当前和
            if(sum<=0)
                sum=val;
            else
                sum=sum+val; // 如果当前和大于0，累加当前和
            greatestSum=Math.max(greatestSum,sum);//更新最大子数组的和值
        }
        return greatestSum;
    }
}
