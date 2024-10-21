import java.util.Scanner;
public class Coban {
    public static int ngto(int n){
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
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
            for(int j = 0; j < m; j++){
                if(ngto(a[i][j]) == 1){
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}