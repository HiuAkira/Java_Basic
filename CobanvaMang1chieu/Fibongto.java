import java.util.Scanner;
public class Fibongto{
    public static long f[] = new long[100001];
    public static int checksnt(int n)
    {
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static int checkfibo(int n)
    {
        f[1] = 1;
        f[2] = 1;
        for(int i = 2 ; i <= 92; i++)
        { 
            f[i] = f[i-1] + f[i-2];
        }
        for(int i = 0; i <= 92; i++)
        {
            if(n == f[i]) return 1;
        }
        return 0;
    }
    public static int tong(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return checkfibo(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i = 0; i < n; i++)
        {
            if(tong(i) == 1 && checksnt(i) == 1)
            {
                System.out.print(i + " ");
            }
        }
    }
}