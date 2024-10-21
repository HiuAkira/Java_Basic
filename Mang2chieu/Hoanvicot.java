import java.util.Scanner;
public class Hoanvicot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[301][301];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int u = sc.nextInt(), v = sc.nextInt();
        for(int i = 0; i < n; i++){
            int tmp = a[i][u-1];
            a[i][u - 1] = a[i][v - 1];
            a[i][v - 1] = tmp;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            } 
        System.out.println("");
        }
     }
}