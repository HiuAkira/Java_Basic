import java.util.Scanner;
public class Mangdanhdau {
    public static int[] cnt = new int[1000001];  // luu so lan xuat hien a[i]
    public static int dem[] = new int[1000001]; // tan so xuat hien cua a[i]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[1000001];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            dem[a[i]]++;
            cnt[a[i]] = 1;
            maxVal = Math.max(maxVal,a[i]);
        }
        // dem so luong so khac nhau
        int res = 0;
        for(int i = 0; i <= maxVal; i++)
        {
            if(cnt[i] == 1) ++res;
        }
        System.out.println(res);
        // dem tan so xuat hien cua cac ptu trong mang
        for(int i = 0; i <= maxVal; i++)
        {
            if(dem[i] != 0) System.out.println(i + " " + dem[i]);
        }
        // liet ke theo thu tu xuat hien trong mang va tan so
        for(int i = 0; i <= n; i++)
        {
            if(dem[a[i]] != 0) 
            {
                System.out.println(a[i] + " " + dem[a[i]]);
                dem[a[i]] = 0;
            }
        }
    }
}
