package easy1;

/**
 * AC
 */
public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        int k;
        int len = nums.length;

        for (int i = 0; i < len; i++)
        {
            for (k = i + 1; k < len; k++)
            {
                if (nums[i] + nums[k] == target)
                {
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        int[] a = {3, 2, 4};
        int target = 6;
        int[] b = new TwoSum().twoSum(a, target);
        for (int c : b)
        {
            System.out.println(c + " ");
        }
    }
}
