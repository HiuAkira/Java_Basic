import java.util.Scanner;
public class Giaipt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        for(int x = 0; x <= n/a; x++)
        {
            if((n - a * x ) % b == 0)
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}