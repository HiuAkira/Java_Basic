import java.util.Scanner;
public class LonnNhon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int a[][] = new int[1001][1001];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = 0; j < m; j++){
                sum += a[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println("");
        for(int i = 0; i < m; i++){
            long ans = 0;
            for(int j = 0; j < n; j++){
                ans += a[j][i];
            }
            System.out.print(ans + " ");
        }
    }
}