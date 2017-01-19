package easy1;

/**
 * 136. Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber
{
    public int singleNumber(int[] nums)
    {
        int num = 0;
        for(int temp : nums)
        {
            num ^= temp;
        }

        return num;
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 1, 2, 2, 4, 5, 4, 5, 9, 8, 9};
        System.out.println(new SingleNumber().singleNumber(nums));
    }
}
