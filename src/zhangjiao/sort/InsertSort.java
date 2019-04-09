public class InsertSort {

    public int[] insertSort(int []number){
        int current;int pre;
        for(int i=1;i<number.length;i++){
            current=number[i];
            pre=i-1;
            while(number[pre]>current&&pre>=0) {
                number[pre + 1] = number[pre];
                pre--;
            }
            number[pre+1]=current;
        }
        return number;
    }

    public static void main(String[]args){
        InsertSort a=new InsertSort();
        int[]arr={1,6,3,2,5,2,8};
        int[]res=a.insertSort(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

}
