package zhangjiao.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintMatrix {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int r1=0,r2=matrix.length-1,c1=0,c2=matrix[0].length-1;
        while(r1<=r2&&c1<=c2){
            for(int i=c1;i<=c2;i++)
                arr.add(matrix[r1][i]);
            for(int i=r1+1;i<=r2;i++)
                arr.add(matrix[i][c2]);
            if(r1!=r2)
                for(int i=c2-1;i>=c1;i--)
                    arr.add(matrix[r2][i]);
            if(c1!=c2)
                for(int i=r2-1;i>r1;i--)
                    arr.add(matrix[i][c1]);
            r1++;r2--;c1++;c2--;
        }
        return arr;
    }
    public static void main(String[]args){
        int[][]nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> arr=printMatrix(nums);
        System.out.print(arr);
    }
}
