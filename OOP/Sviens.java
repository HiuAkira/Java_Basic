import java.util.Scanner;

public class Sviens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Svien s = new Svien("SV001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        s.chuanHoa();
        System.out.println(s);
    }
}