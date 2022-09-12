public class huiwen
{
    public static void main(String[] args)
    {
        int d=123321;
        boolean s=isPalindrome(d);
        System.out.println(s);
    }
    public static boolean isPalindrome(int x)
    {
        if(x<0||x%10==0&&x!=0)
            return false;
        int b=((x+"").length()+1)/2;
        int a=0;
        for(int i=0;i<b;i++)
        {
            a=a*10+x%10;
            x/=10;
        }
        return a/10==x||a==x;
    }

}
