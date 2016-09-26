package easy1;

/**
 * Created by liuyang on 2016/9/27.
 */

public class NimGame
{
    public boolean canWinNim(int n)
    {
        return !(n%4 == 0);
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(new NimGame().canWinNim(n));
    }
}
