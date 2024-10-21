import java.util.Scanner;
public class DigitalRoot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(n >= 10)
        {
            int tong = 0;
            while(n != 0)
            {
                tong += n % 10;
                n /= 10;
            }
            n = tong;
        }
        System.out.println(n);
    }
}