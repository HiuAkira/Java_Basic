import java.util.Scanner;
public class Thuasongtomuln{
    public static void count(long n)
    {
        long ans = 0, maxMu = 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                int mu = 0;
                while(n % i == 0)
                {
                    n /= i;
                    ++mu;
                }
                if(maxMu < mu)
                {
                    maxMu = mu;
                    ans = i;
                }
            }
        }
        if(n > 1)
        {
            if(1 > maxMu)
            {
                maxMu = 1;
                ans = n;
            }
        }
        System.out.println(ans + " " + maxMu);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        count(nx);
    }
}