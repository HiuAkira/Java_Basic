import java.util.Scanner;
public class Demclvatong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100001];
        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        int chan = 0, le = 0, tongchan = 0, tongle = 0;
        for(int i = 1; i <= n; i++)
        {
            if(a[i] % 2 == 0)
            {
                chan++;
                tongchan += a[i];
            }
            else
            {
                le++;
                tongle += a[i];
            }
        }
        System.out.println(chan);
        System.out.println(le);
        System.out.println(tongchan);
        System.out.println(tongle);
    }
}
