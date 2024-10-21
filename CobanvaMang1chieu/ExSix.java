import java.util.Scanner;
public class ExSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( (n % 2) == 0) 
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        if((n % 3 == 0) && (n % 5 == 0)) {
             System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if((n % 3 == 0) && (n % 7 != 0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if((n % 3 == 0) || (n % 7 == 0)){
             System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if((n > 30) && (n < 50)) {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
        if( (n >= 30) && ( (n % 2 == 0) || (n % 3 == 0) || (n % 5 == 0) ) )
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        int r = n % 10;
        if(n >= 10 && n <= 99 && (r == 2 || r == 3 || r == 5 || r == 7))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        if((n <= 100) && (n % 23 == 0)) { 
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if((n < 10) || (n > 20)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        if(r % 3 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}