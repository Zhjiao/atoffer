package zhangjiao;

//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
public class Power {
    public double power(double base,int exponent){
        if(exponent==0)
            return 1;
        if(exponent==1)
            return base;
        if(exponent>0) {
            int key = exponent % 2;
            if (key == 1)
                return base * power(base * base, exponent / 2);
            else
                return power(base * base, exponent / 2);
        }
        else{
            return 1/power(base,-1*exponent);
        }
    }
//     public double power(double base,int exponent){
//         return Math.pow(base,exponent);
//     }
        public static void main(String[]args){
            Power p=new Power();
            double a=2;int b=-3;
            System.out.println(p.power(a,b));
        }

}
