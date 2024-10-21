import java.util.Scanner;
public class Lietke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        int dem[] = new int[100001];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
            dem[a[i]]++;
        }
        for(int i = 1; i <= n; i++)
        {
            int check = 0;
            for(int j = 1; j < i; j++)
            {
                if(a[i] == a[j])
                {
                    check = 1;
                    break;
                }
            }
            //if(check == 0) System.out.print(a[i] + " ");
            if(check == 0)
            {
                int ans = 1;
                for(int j = i + 1; j <= n; j++)
                {
                    if(a[i] == a[j]) ans++;
                }
                System.out.println(a[i] + " " + ans);
            }
            
        }
        /*for(int i = 1; i <= n; i++)
        {
            System.out.println(a[i] + " " + dem[i]);
        }*/
    }
}
