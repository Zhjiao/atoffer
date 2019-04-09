package com.example.demo41;

public class MovingArea {
    private int rows;
    private int cols;
    private int count=0;//计数个数
    private int [][]next={{1,0},{-1,0},{0,-1},{0,1}};
    private int threshold;//不能进入行坐标和列坐标的数位之和大于threshold的格子
    private int[][] digitSum;//记录每个坐标的位数之和
    public int movingCount(int threshold, int rows, int cols)
    {
        this.rows=rows;
        this.cols=cols;
        this.threshold=threshold;
        initDigitSum();//把每个坐标位数和进行初始化
        boolean[][]marked=new boolean[rows][cols];
        dfs(marked,0,0);
        return count;
    }
    private void dfs(boolean[][]marked,int r,int c){
        if(r<0||c<0||r>=rows||c>=cols||marked[r][c])
            return;
        if(digitSum[r][c]>threshold)
            return;
        marked[r][c]=true;
        count++;
        for(int []n:next)
            dfs(marked,r+n[0],c+n[1]);
    }
    private void initDigitSum(){
        int len=Math.max(rows,cols);
        int []pos=new int[len];
        for(int i=0;i<len;i++){
            int n=i;
            while(n>0)
            {
                pos[i]+=n%10;
                n=n/10;
            }
        }
        this.digitSum=new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                digitSum[i][j]=pos[i]+pos[j];

    }
}
