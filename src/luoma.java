import java.util.HashMap;
import java.util.Map;
public class luoma
{
    public static void main(String[] args)
    {
        String aa="III";
        int sss=romanToInt(aa);
        System.out.println(sss);
    }

    public static int romanToInt(String s)
    {
        Map<Character,Integer> symbolValues=new HashMap<Character,Integer>()
        {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        int a=0;
        int c=s.length();
        for (int i=0;i<c;++i)
        {
            int b=symbolValues.get(s.charAt(i));
            if (i<c-1&&b<symbolValues.get(s.charAt(i+1)))
            {
                a-=b;
            }
            else
            {
                a+=b;
            }
        }
        return a;
    }
}