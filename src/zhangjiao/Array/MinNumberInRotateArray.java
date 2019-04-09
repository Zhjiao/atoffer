public class MinNumberInRotateArray {
    public static int minNumberInRotateArray(int[] nums){
        if(nums.length==0)
            return 0;
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<=nums[right])
                right=mid;
            else
                left=mid+1;
        }
        return nums[left];
    }
    public static void main(String[]args){
        int []nums={1,1,0,1,1,1};
        //int[]nums={3,4,5,1,2};
        //int[]nums={};
        int min=minNumberInRotateArray(nums);
        System.out.println(min);
    }
}
