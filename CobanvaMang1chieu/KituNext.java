import java.util.Scanner;
public class KituNext{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c == 'z' || c == 'Z'){
            System.out.println("a");
        }
        else if((c >= 'A') && (c <= 'Z')){
            c += 32;
            ++c;
            System.out.println(c);
        }
        else
        {
            ++c;
            System.out.println(c);
        }
    }
}