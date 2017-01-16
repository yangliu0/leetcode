package easy1;

/**
 * 485. Max Consecutive Ones
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */
public class MaxConsecutiveOnes
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int max = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < nums.length; i++)
        {
            stringBuilder.append(nums[i]);
        }

        String str = stringBuilder.toString();
        String[] strArray = str.split("0");

        for(String str1 : strArray)
        {
            if(str1.length() > max)
            {
                max = str1.length();
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
    }
}
