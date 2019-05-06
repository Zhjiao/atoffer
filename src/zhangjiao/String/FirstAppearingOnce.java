package zhangjiao.String;

import java.util.LinkedList;
import java.util.Queue;

public class FirstAppearingOnce {
    private int[] array=new int[256];
    //int数组大小256，初始值为0，8位字符编码只能到255
    private Queue<Character> queue=new LinkedList<>();

    public void Insert(char ch){

        array[ch]++;
        queue.add(ch);
        while(!queue.isEmpty()&&array[queue.peek()]>1)
            queue.poll();
    }
    public char FirstAppearingOnce(){
        if(queue.isEmpty())
            return '#';
        return queue.peek();
    }
}
