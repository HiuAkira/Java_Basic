import java.util.Scanner;
public class Thuonggt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res = 1;
        long gt = 1;
        for(int i = 1; i <= n - 1; i++)
        {
            gt *= i;
            res += (double)1/gt;
        }
        System.out.printf("%.4f", res);
    }
}