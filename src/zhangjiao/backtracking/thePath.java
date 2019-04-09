public class thePath {

        private int [][]next={{1,0},{-1,0},{0,1},{0,-1}};
        private int rows;
        private int cols;

        public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
            this.cols=cols;
            this.rows=rows;
            boolean[][]marked=new boolean[rows][cols];
            char[][]array=buildMatrix(matrix,rows,cols);
            for(int i=0;i<rows;i++)
                for(int j=0;j<cols;j++)
                    if(backTracking(array,str,marked,0,i,j))
                        return true;
             return false;
        }
        private boolean backTracking(char[][]array,char[]str,boolean[][]marked,int len,int r,int c){
            if(len==str.length)
                return true;
            if(r<0||r>=rows||c>=cols||c<0||array[r][c]!=str[len]||marked[r][c])
                return false;
            marked[r][c]=true;
            for(int[]n:next)
                if(backTracking(array,str,marked,len+1,r+n[0],c+n[1]))
                    return true;
             marked[r][c]=false;
             return false;
        }
        private char[][] buildMatrix(char[]matrix,int rows,int cols){
            char[][]array=new char[rows][cols];
            for(int i=0,pos=0;i<rows;i++)
                for(int j=0;j<cols;j++)
                    array[i][j]=matrix[pos++];
            return array;
        }
        public static void main(String[]args){
            thePath p=new thePath();
            char[]array={'a','b','t','g','c','f','c','s','j','d','e','h'};
            int col=4;int row=3;
            char[]str={'b','f','c','e'};
            System.out.println(p.hasPath(array,row,col,str));
        }

}
