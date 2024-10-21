import java.util.Scanner;
public class Fibo{
    public static long f[] = new long[100001];
    public static int checkfibo(long n)
    {
        for(int i = 0; i <= 92; i++)
        {
            if(n == f[i]) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        f[0] = 0;
        f[1] = 1;
        for(int i = 2 ; i <= n; i++)
        { 
            f[i] = f[i-1] + f[i-2];
        }
        if(checkfibo(n) == 1) System.out.print("YES");
        else System.out.println("NO");
    }
}