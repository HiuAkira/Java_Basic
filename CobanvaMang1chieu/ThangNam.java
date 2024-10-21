import java.util.Scanner;
public class ThangNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        if( ( (1 <= t) && (t <= 12) ) && ( (0 < n) ) )
        {   
            if(t == 2)
            {
                if((n % 400) == 0 || (n % 4 == 0 && n % 100 != 0))
                {
                    System.out.println("29");
                }
                else
                {
                    System.out.println("28");
                }
            }
            else if( (t == 1) || (t == 3) || (t == 5) || (t == 7) || (t == 8) || (t == 10) || (t == 12) )
            {
                System.out.println("31");
            }
            else
            {
                System.out.println("30");
            }
        }
        else
        {
            System.out.println("INVALID");
        }
    }
}