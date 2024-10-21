import java.util.Scanner;
public class TongK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = 0;
        for(int i = 1; i <= n; i++)
            for(int j = i + 1; j <= n; j++)
            {
                if(a[i] + a[j] == k) res++; 
            }
        System.out.println(res);
    }
}
