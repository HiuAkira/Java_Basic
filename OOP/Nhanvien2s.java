import java.util.Scanner;

public class Nhanvien2s {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhanvien2 n = new Nhanvien2("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        n.chuanHoa();
        System.out.println(n);
    }
}