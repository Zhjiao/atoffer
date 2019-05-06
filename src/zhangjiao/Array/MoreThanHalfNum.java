package zhangjiao.Array;

import java.util.Arrays;

//输出数组中出现次数超过一半的数字，如果不存在则输出0
public class MoreThanHalfNum {

    //1.先对数组排序，然后取中间位置的元素，再对数据扫描一趟来判断此元素是否为多数元素。时间复杂度O(nlog(n))，空间复杂度O(1)。
    public static int MoreThanHalfNum_Solution(int[] nums) {
        Arrays.sort(nums);
        int num=nums[nums.length/2];
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i]==num)
                count++;
            if(nums[i]>num)
                break;
        }
        if(count>nums.length/2)
            return num;
        else
            return 0;
    }

    //利用多数投票问题解决该问题，使得时间复杂度为O（N）
    //令majority为第一个元素的值，count=1进行遍历，如果now和现在数组元素值相同，则count++，反之count–；
    // 如果count==0，则将now的值设置为数组的当前元素，将count赋值为1；直到结束
    public int MoreThanHalfNum_Solition2(int[]nums){
        int majority=nums[0];
        for(int i=1,count=1;i<nums.length;i++){
                if (nums[i] == majority)
                    count++;
                else
                    count--;
                if(count==0) {
                    majority = nums[i];
                    count=1;
                }
            }
        int count=0;
        for(int val:nums)
            if(val==majority)
                count++;
        if(count>nums.length/2)
            return majority;
        else
            return 0;
    }

    public static void main(String[]args){
        int[] nums={2,2,3,2,2,2,5,4,2,3};
        System.out.print(MoreThanHalfNum_Solution(nums));
    }
    }
