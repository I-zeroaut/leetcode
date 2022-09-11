public class lastword
{
    public static void main(String[] args)
    {
        String s="hello world ";
        int a=lengthOfLastWord(s);
        System.out.println(a);
    }
    public static int lengthOfLastWord(String s)
    {
        int a=s.length();
        char[] b=s.toCharArray();
        int c=0;
        int d=a;
        zzz:
        for(int i=(a-1);i>=0;i--)
        {
            if (b[i] ==' '&&c==0)
            {
                d=i;
                continue zzz;
            }
            if (b[i]==' '&&c!=0)
            {
                c=i+1;
                break zzz;
            }
            c=i;
        }
        return d-c;
    }

}