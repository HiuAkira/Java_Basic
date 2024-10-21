import java.util.Scanner;
public class Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        for(int i = n; i > 0; i--)
        {
            System.out.print(a[i] + " ");
        }
    }
}
