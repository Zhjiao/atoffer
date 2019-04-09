public class ReplaceSpaces {
    public static String replaceSpace(StringBuffer str) {
        //先从前向后遍历，确定更改后的字符串的长度，再从后向前进行赋值
        int p1=str.length()-1;
        for(int pos=0;pos<=p1;pos++)
        {
            if(str.charAt(pos)==' ')
                str.append("  ");
        }
        int p2=str.length()-1;
        while(p1>=0&&p2>p1){
            if(str.charAt(p1)!=' ')
            {
                str.setCharAt(p2,str.charAt(p1));
                p2--;p1--;
            }
            else{
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
                p1--;

            }
        }
        return str.toString();
    }

    public static void main(String []args){

        StringBuffer str=new StringBuffer("hello world and you!");
        System.out.println(str);
        System.out.println(replaceSpace(str));
    }
}
