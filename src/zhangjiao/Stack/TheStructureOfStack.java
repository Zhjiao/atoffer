package zhangjiao.Stack;

import zhangjiao.greedy.IntergerCut;

import java.util.Stack;

public class TheStructureOfStack {
    private Stack<Integer> dataStack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();
    public void push(int node) {
        dataStack.push(node);
        if(minStack.empty())
            minStack.push(node);
        else{
            if(node<=minStack.peek()) {
                minStack.push(node);
            }else
                minStack.push(minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
