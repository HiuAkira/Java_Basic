import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
public class Sxcdai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        Arrays.sort(a, new Comparator<String>() {
            public int compare(String a, String b)
            {
                if(a.length() != b.length()) return a.length() - b.length();
                return a.compareTo(b);
            };
        });
        for(String x : a){
            System.out.print(x + " ");
        }
    }
}
