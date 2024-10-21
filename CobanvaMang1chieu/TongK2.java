import java.util.Scanner;
public class TongK2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++)
            for(int j = i + 1; j <= n; j++)
            {
                if(Math.abs(a[i] - a[j]) < ans) ans = Math.abs(a[i] - a[j]); 
            }
        System.out.println(ans);
    }
}
