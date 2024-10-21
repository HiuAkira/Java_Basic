import java.util.Scanner;
public class GiaiPtbh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a == 0)
        {
            if(b == 0)
            {
                if(c != 0)
                {
                    System.out.println("VO NGHIEM");
                }
                else
                {
                    System.out.println("VO SO NGHIEM");
                }
            }
            else
            {
                System.out.printf("%.2f\n", (double)-c / b);
            }
        }
        else
        {
            int dt = b * b - 4 * a * c;
            if(dt < 0)
            {
                System.out.println("VO NGHIEM");
            }
            else if(dt == 0)
            {
                System.out.printf("%.2f\n", (double)-b / (2*a));
            }
            else
            {
                double x1 = (-b + Math.sqrt(dt)) / (2 * a);
                double x2 = (-b - Math.sqrt(dt)) / (2 * a);
                System.out.printf("%.2f %.2f", x2, x1);
            }
        }
    }
}