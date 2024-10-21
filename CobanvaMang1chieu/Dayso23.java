import java.util.Scanner;
public class Dayso23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long f[] = new long[1000001];
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <= n; i++)
        {
            f[i] = 2 * f[i-1] + 3 *f[i-2];
            f[i] %= 100000007;
        }
        System.out.println(f[n]);
    }
}