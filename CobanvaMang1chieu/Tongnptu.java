import java.util.Scanner;
public class Tongnptu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int b[] = new int[100001];
        if(n % 2 == 0)
        {
            for(int i = 1; i < n; i++)
            {
                b[i] = a[i] + a[i+1];
            }
        }
        else
        {
            for(int i = 1; i < n; i++)
            {
                b[i] = a[i] + a[i+1];
            }
        }
        for(int i = 1; i < n; i++)
        {
            System.out.print(b[i] + " ");    
        }
    }
}