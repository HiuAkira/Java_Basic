import java.util.Scanner;

public class Lopsinhvien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Khoitao s = new Khoitao(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        //s.output();
        System.out.println(s);
    }
}