import java.util.Scanner;
public class Uocnto{
    public static int count(long n)
    {
        int ans = 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                ++ans;
                while(n % i == 0)
                {
                    n /= i;
                }
            }
        }
        if(n > 1) ++ans;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(count(n));
    }
}