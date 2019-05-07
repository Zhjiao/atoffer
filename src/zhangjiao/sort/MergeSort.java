package zhangjiao.sort;

import java.util.Arrays;

//2路归并排序
public class MergeSort {
    public static void mergeSort(int[]nums){
       mergeSort(nums,0,nums.length-1);
    }
    private static void mergeSort(int[]nums,int start,int end){
        if(start>=end)
            return;
        int mid=(start+end)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    private static void merge(int[]nums,int start,int mid,int end){
        int[]temp=new int[nums.length];
        int i=start,j=mid+1,k=0;
        while(i<=mid&&j<=end){
            if(nums[i]>nums[j])
                temp[k++]=nums[j++];
            else
                temp[k++]=nums[i++];
        }
        while(i<=mid)
            temp[k++]=nums[i++];
        while(j<=end)
            temp[k++]=nums[j++];
        for(int pos=0;pos<k;pos++)
            nums[start+pos]=temp[pos];// 将临时数组中的内容拷贝回原数组中 （left-right范围的内容）
    }
    public static void main(String[] args) {
        //测试数据
        int A[] = { 1, 6, 4, 5, 2, 9, 7, 23, 56, 43, 99 };
        // 排序前
        System.out.println("排序前：");
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
        // 排序
        mergeSort(A);
        // 排序后
        System.out.println("排序后：");
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
