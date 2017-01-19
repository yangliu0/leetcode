package easy1;

/**
 * 231. Power of Two
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerofTwo
{
    public boolean isPowerOfTwo(int n)
    {
        int num = 0;
        if(n == 0)
        {
            return false;
        }
        while (n != 0)
        {
            if ((n & 1) == 1)
            {
                num++;
            }
            n >>= 1;
            if(num > 1)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(new PowerofTwo().isPowerOfTwo(4));
    }
}
