package zhangjiao;

public class JumpFloor {

    //一次可以跳一阶梯，也可以跳两阶梯，跳上n级的阶梯共有几种方法
   public int jumpFloor1(int target){
       //基本的斐波那契数列
       if(target<=2)
           return target;
       int res=0;
       int pre1=2;int pre2=1;
       for(int i=3;i<=target;i++){
           res=pre1+pre2;
           pre2=pre1;
           pre1=res;
       }
       return res;
    }

    public int jumpFloor2(int target){
        //一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。跳上一个n级的台阶总共有多少种跳法
        if(target<=2)
            return target;
        int res=1;
        for(int i=1;i<target;i++){
            res+=jumpFloor2(target-i);
        }
        return res;
   }

}
