import java.util.Scanner;
public class SxCup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt();
        int b1 = sc.nextInt(), b2 = sc.nextInt(), b3 = sc.nextInt();
        int n = sc.nextInt();
        int sumcup = a1 + a2 + a3;
        int kecup = sumcup % 5;
        int sumkecup = 0;
        int sumhc = b1 + b2 + b3;
        int kehc = sumhc % 10;
        int sumkehc = 0;
        if(kecup == 0)
        {
            sumkecup = sumcup / 5;
        }
        else{
            sumkecup = (sumcup / 5) + 1;
        }
        if(kehc == 0){
            sumkehc = sumhc / 10;
        }
        else{
            sumkehc = (sumhc / 10) + 1;
        }
        if(sumkehc + sumkecup <= n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}