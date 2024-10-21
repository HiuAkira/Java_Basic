import java.util.Scanner;

public class Phansos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phanso s = new Phanso(sc.nextLong(), sc.nextLong());
        s.rutGon();;
        System.out.println(s);
    }
}