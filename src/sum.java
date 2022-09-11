import java.util.Arrays;

public class sum
{
    public static void main(String[] ags)
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] sss = twoSum(nums, target);
        System.out.println(Arrays.toString(sss));
    }
    public static int[] twoSum(int[] nums, int target)
    {
        int a=nums.length;
        for(int i=0;i<a;i++)
            for(int y=0;y<i;y++)
                if(nums[i]+nums[y]==target)
                    return new int[]{y,i};
        return new int[0];

        }


}