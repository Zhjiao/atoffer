 //尽可能多剪长度为 3 的绳子，并且不允许有长度为 1 的绳子出现。如果出现了，就从已经切好长度为 3 的绳子中拿出一段与长度为 1 的绳子重新组合，把它们切成两段长度为 2 的绳子。
  
 public int IntergerBreak(int n){
       if(n<2)
           return 0;
       if(n==2)
           return 1;
       if(n==3)
           return 2;
       int p1=n/3;
       if(n%3==1)
           p1--;
       int p2=(n-p1*3)/2;
       return (int)(Math.pow(3,p1)*Math.pow(2,p2));
   }
