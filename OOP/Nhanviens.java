import java.util.Scanner;

public class Nhanviens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhanvien s = new Nhanvien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(s);
    }
}