import java.util.Scanner;
public class Tongsochan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        for(int i = 1; i <= n; i++)
        {
            int x = sc.nextInt();
            if((x % 2) == 0)
            {
                tong += x;
            }
        }
        System.out.println(tong);
    }
}