package zhangjiao.sort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

public class QuickSort {
    //快速排序（三数取其中）
    //从数列中挑出一个元素，称为 “基准”（pivot）；
    // 所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
    //然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列
    public void quickSort(int []nums){
        quickSort(nums,0,nums.length-1);
    }
    private void quickSort(int[]nums,int start,int end){
        if(start>=end)
            return;
        int index = partition(nums, start, end);
        quickSort(nums,start,index-1);//处理基准数的左边
        quickSort(nums,index+1,end);//处理基准数的右边

    }
    private int partition(int[] nums, int left, int right){
        int middle=nums[left];
        while(left<right)
        {
            while(left<right && nums[right]>middle)
                right--;
            if(left<right){
                nums[left] = nums[right];
            }
            while(left<right && nums[left]<=middle)
                left++;
            if(left<right){
                nums[left] = nums[right];
            }
        }
        nums[left] = middle;
        return left;
    }
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        //测试数据
        int A[] = { 1, 6, 4, 5, 2, 9, 7, 23, 56, 43, 99 };
        // 排序前
        System.out.println("排序前：");
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
        // 排序
        quickSort.quickSort(A);
        // 排序后
        System.out.println("排序后：");
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
