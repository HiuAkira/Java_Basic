import java.util.Scanner;
public class Sothuannghich {
    public static boolean tn(int n){
        int tmp = n, rev = 0;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return tmp == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[1001][1001];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = 0; j <= i; j++){
                if(tn(a[i][j])) ++cnt;
            }
        }
        System.out.println(cnt);
    }
}