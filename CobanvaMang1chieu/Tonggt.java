import java.util.Scanner;
public class Tonggt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), gt = 1, res = 0;
        for(int i = 1; i <= n; i++)
        {
            gt *= i;
            res += gt;
        }
        System.out.println(res);
    }
}