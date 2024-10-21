import java.util.Scanner;
public class Hoanvidcheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[501][501];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            int tmp = a[i][i];
            a[i][i] = a[i][n - i - 1];
            a[i][n - i - 1] = tmp;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            } 
        System.out.println("");
        }
     }
}