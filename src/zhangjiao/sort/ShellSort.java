package zhangjiao.sort;
import java.util.Arrays;
public class ShellSort {
    public static void sort(int[]arr){
        //增量gap，并逐步缩小增量
        for(int gap=arr.length/2;gap>0;gap=gap/2){
            for(int i=gap;i<arr.length;i++){
                int j=i;
                int temp=arr[j];
                //从第gap个元素，逐个对其所在组进行直接插入排序操作
                while(j-gap>=0&&temp<arr[j-gap]){
                    //移动法
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=temp;
            }
        }
    }
    public static void main(String[]args){
        int[]arr={1,5,2,7,3,9,4,6};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
