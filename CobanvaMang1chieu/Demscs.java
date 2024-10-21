import java.util.Scanner;
public class Demscs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long dem = 0;
        if(n == 0) System.out.println('1');
        else{
            while(n != 0)
            {
                dem ++;
                n /= 10;
            }
            System.out.println(dem);
        }
    }
}