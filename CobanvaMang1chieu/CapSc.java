import java.util.Scanner;
public class CapSc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), u1 = sc.nextInt(), d = sc.nextInt();
        long un = u1 + (long)(n - 1) *d;
        System.out.println(n * (u1 + un) / 2);
    }
}