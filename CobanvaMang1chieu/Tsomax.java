import java.util.Scanner;
public class Tsomax {
    public static int dem[] = new int[1000001]; // tan so xuat hien cua a[i]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[1000001];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            dem[a[i]]++;
        }
        int maxF = -1, res = 0;
        // duyet theo thu tu lon be
        for(int i = 0; i < 1000001; i++)
        {
            if(dem[i] > maxF) // lay nho nhat
            // neu lay lon nhat thi if(dem[i] >= maxF)
            {
                maxF = dem[i];
                res = i;
            }
        }
        System.out.println(res + " " + maxF);
        // duyet theo thu tu trong mang
        int maxM = -1, ans = 0;
        for(int i = 0; i < n; i++)
        {
            if(dem[a[i]] > maxM)
            {
                maxM = dem[a[i]];
                ans = a[i];
            }
        }
        System.out.println(ans + " " + maxM);
    }
}