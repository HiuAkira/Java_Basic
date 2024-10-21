import java.util.Scanner;
public class TongBp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += 1l * i * i;
        }
        System.out.println(sum);
    }
}