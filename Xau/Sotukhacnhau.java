import java.util.HashSet;
import java.util.Scanner;
public class Sotukhacnhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String a[] = s.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String x : a){
            set.add(x);
        }
        System.out.println(set.size());
    }
}
