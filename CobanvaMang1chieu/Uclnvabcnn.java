import java.util.Scanner;
public class Uclnvabcnn{
    public static long gcd(long a,long b)
    {
        while(b!= 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static long lcm(long a, long b)
    {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.println(gcd(gcd(a,b),gcd(c,d)) + " " + lcm(lcm(a,b),lcm(c,d)));
    }
}