import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        int max1 =  Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++)
        {
            max1 = Math.max(max1, a[i]);
            min1 = Math.min(min1, a[i]);
        }
        System.out.println(max1);
    }
}