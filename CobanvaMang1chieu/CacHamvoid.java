import java.util.Scanner;
public class CacHamvoid {
    public static void helloWorld()
    {
        System.out.println("Hello");
    }
    public static void xuLy(int n, long m, char c) {
        System.out.println(n + " " + m + " " + c);
    }
    public static int check(int n)
    {
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //helloWorld();
        //System.out.println("END");
        //xuLy(28, 1000000000, '@');
        if(check(n) == 0) System.out.println("n ko ph la snt");
        else System.out.println("n ko ph la snt");
    }
}
