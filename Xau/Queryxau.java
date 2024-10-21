import java.util.Scanner;
public class Queryxau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = s.length() - 1; i >= 0; i --){
            System.out.print(s.charAt(i));
        }
        System.out.println("");
        String u = s.toLowerCase();
        String v = s.toUpperCase();
        System.out.println(u);
        System.out.println(v);       
    }
}
