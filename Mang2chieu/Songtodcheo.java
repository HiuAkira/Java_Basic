import java.util.Scanner;
public class Songtodcheo {
    public static int nt(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[301][301];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(nt(a[i][i]) == 1) ++cnt;
            if(nt(a[i][n - i - 1]) == 1) ++cnt;
        }
        if(n % 2 == 1){
            if(nt(a[n / 2][n / 2]) == 1) --cnt;
        }
        System.out.println(cnt);
    }
}