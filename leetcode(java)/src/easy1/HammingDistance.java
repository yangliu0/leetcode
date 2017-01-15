package easy1;

/**
 * 461.Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * AC
 */

public class HammingDistance
{
    public int hammingDistance(int x, int y)
    {
        int xor = x ^ y;
        int n = 0;
        String xorBinary = Integer.toBinaryString(xor);
        for (int i = 0; i < xorBinary.length(); i++)
        {
            if((xor & 1) == 1)
            {
                n++;
            }

            xor = xor >> 1;
        }
        return n;
    }

    public static void main(String[] args)
    {
        int x = 1, y = 4;
        System.out.println(new HammingDistance().hammingDistance(x, y));
    }
}
