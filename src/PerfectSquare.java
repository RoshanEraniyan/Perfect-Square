
import java.util.*;

class Solution
{
    public boolean square(int n)
    {
        int i=0,product=1;
        while(product<n)
        {
            i++;
            product=i*i;
        }
        if(product==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class PerfectSquare
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Solution solution =new Solution();
        System.out.println(solution.square(n));
    }
}
