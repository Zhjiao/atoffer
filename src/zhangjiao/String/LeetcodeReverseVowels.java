package zhangjiao.String;
public class LeetcodeReverseVowels {
    public static String reverseVowels(String s){
        int i,j;
        char[]s1=s.toCharArray();
        for(i=0,j=s1.length-1;i<j;){
            if(isVowels(s1[i])){
                if(isVowels(s1[j]))
                {
                    char temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                    i++;j--;
                }
                else
                    j--;
            }
            else
                i++;
        }
        return new String(s1);
    }
    private static boolean isVowels(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        return false;
    }
    public static void main(String[]args){

        String str1="hello";
        String str2=reverseVowels(str1);
        System.out.println(str2);
    }
}
