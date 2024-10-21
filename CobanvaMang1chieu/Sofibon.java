import java.util.Scanner;
public class Sofibon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long f[] = new long[1000001];
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <= 92; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }
        for(int i = 1; i <= 92; i++)
        {
            if(f[i] > n)
            {
                System.out.println(f[i]);
                break;
            }
        }
    }
}