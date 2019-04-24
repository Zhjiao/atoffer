package zhangjiao.Stack;

import java.util.Stack;

public class IsPopOrder {
    public boolean IsPopOrder(int[]pushSequence,int[]popSequence){
        int n=pushSequence.length;
        Stack<Integer> stack=new Stack<>();
        for(int pushIndex=0,popIndex=0;pushIndex<n;pushIndex++){
            stack.push(pushSequence[pushIndex]);
            while(popIndex<n&&!stack.empty()&&popSequence[popIndex]==stack.peek()){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}