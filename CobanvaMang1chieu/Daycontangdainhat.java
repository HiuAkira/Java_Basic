import java.util.Scanner;
public class Daycontangdainhat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z = 1; z <= t; z++)
        {
            int n = sc.nextInt();
            int a[] = new int[1000001];
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }
            int pos[] = new int[1000001];
            int cnt = 0;
            int maxLen = 1, len = 1;
            for(int i = 1; i < n; i++)
            {
                if(a[i] > a[i-1]) ++len;
                else 
                {
                    if(len > maxLen)
                    {
                        maxLen = len;
                        pos[0] = i - maxLen;// chi so bat dau cua day con tm
                        cnt = 1; 
                        
                    }
                    else if(len == maxLen)
                    {
                        pos[cnt] = i - maxLen;
                        ++cnt;
                    }
                    len = 1; // a[i]
                }
            }
            if(len > maxLen)
            {
                maxLen = len;
                pos[0] = n - maxLen; // chi so bat dau cua day con tm
                cnt = 1;
            }
            else if(len == maxLen)
            {
                pos[cnt] = n - maxLen;
                ++cnt;
            }
            System.out.println("Test #" + z + " :");
            System.out.println(maxLen);
            for(int i = 0; i < cnt; i++)
            {
                for(int j = 0; j < maxLen; j++)
                {
                    System.out.print(a[pos[i] + j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
/*5
10
39 48 41 18 12 35 10 29 29 45
10
19 37 14 24 49 45 36 25 38 16
10
40 28 1 29 11 1 36 32 33 26
10
13 32 1 18 49 7 48 1 17 32
10
45 27 27 19 15 10 6 1 0 0*/
