package zhangjiao.String;

import java.util.ArrayList;
import java.util.Arrays;

public class AllOrders {

    ArrayList<String> ret=new ArrayList<>();
    public ArrayList<String>Permutation(String str){
        if(str.length()==0)
            return ret;
        char[]chars=str.toCharArray();
        Arrays.sort(chars);
        boolean []marked=new boolean[chars.length];
        backtracking(chars,marked,new StringBuilder());
        return ret;

    }
    private void backtracking(char[]chars,boolean[]marked,StringBuilder s){
        if(s.length()==chars.length){
            ret.add(s.toString());
            return;
        }
        for(int i=0;i<chars.length;i++){
            if(marked[i])
                continue;
            if(i!=0&&chars[i]==chars[i-1]&&!marked[i-1]) //保证不重复
                continue;
            marked[i]=true;
            s.append(chars[i]);
            backtracking(chars,marked,s);
            s.deleteCharAt(s.length()-1);
            marked[i]=false;
        }
    }

}
