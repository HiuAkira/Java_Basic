import java.util.Scanner;
public class Uclncuagt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long x = Math.min(a,b);
        long gt = 1;
        for(int i = 1; i <= x; i++)
        {
            gt *= i;
        }
        System.out.println(gt);
    }
}