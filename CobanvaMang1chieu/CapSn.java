import java.util.Scanner;
public class CapSn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if(b % a == 0)
        {
            int q = b / a;
            if(b * q == c && c * q == d)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
}