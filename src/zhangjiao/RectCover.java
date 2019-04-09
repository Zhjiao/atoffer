public class RectCover {
    //用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
    public int rectCover(int n){
        if(n<=2)
            return n;
        int pre2=1,pre1=2;
        int result=0;
        for(int i=3;i<=n;i++){
            result=pre1+pre2;
            pre2=pre1;
            pre1=result;
        }
        return result;

//        if(n<=2)
//            return n;
//        else
//            return rectCover(n-1)+rectCover(n-2);
    }
}
