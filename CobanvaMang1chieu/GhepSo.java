import java.util.Scanner;
public class GhepSo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2 = sc.nextInt(), k3 = sc.nextInt(), k5 = sc.nextInt(), k6 = sc.nextInt();
        int k256 = Math.min(k2, Math.min(k5, k6));
        int k32 = Math.min(k3, k2 - k256);
        System.out.println((long)k256 * 256 + (long)k32 * 32);
    }
}