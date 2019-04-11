package zhangjiao.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReOrderArray {
    //需要保证奇数和奇数，偶数和偶数之间的相对位置不变时
    public static void reOrderArray(int[] nums){
        int oddcnt=0;//奇数个数
        for(int val:nums){
            if(val%2==1)
                oddcnt++;
        }
        int[]copy=nums.clone();
        int pos=0;
        for(int i=0,j=oddcnt;pos<copy.length;pos++)
        {
            if(copy[pos]%2==1)
                nums[i++]=copy[pos];
            else
                nums[j++]=copy[pos];
        }
    }

    //当不需要保证奇数和奇数，偶数和偶数之间的相对位置不变时
//    public static void reOrderArray(int[] nums){
//        for(int i=0,j=nums.length-1;i<j;) {
//           while(nums[i] % 2 == 1)
//                i++;
//            while(nums[j] % 2 == 0)
//                j--;
//            if(i<j)
//            {
//                int temp=nums[i];
//                nums[i]=nums[j];
//                nums[j]=temp;
//            }
//        }
//
//    }
    public static void main(String[]args){
        int[]nums={1,2,3,4,5};
        reOrderArray(nums);
        System.out.print(Arrays.toString(nums));
    }
}
