package zhangjiao.String;
public class LeetcodeReverseVowels {
    public static String reverseVowels(String s) {

        int i,j;
        char[] s1=s.toCharArray();
        for(i=0,j=s1.length-1;i<j;)
        {
            if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U')
            {
                if(s1[j]=='a'||s1[j]=='e'||s1[j]=='i'||s1[j]=='o'||s1[j]=='u'||s1[j]=='A'||s1[j]=='E'||s1[j]=='I'||s1[j]=='O'||s1[j]=='U')
                {
                    char temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                    i++;j--;
                }
                else
                {
                    j--;
                 }
            }
            else
            {
                i++;
            }
        }
        String s2=new String(s1);
        return s2;

    }
    public static void main(String[]args){

        String str1="hello";
        String str2=reverseVowels(str1);
        System.out.println(str2);
    }
}
