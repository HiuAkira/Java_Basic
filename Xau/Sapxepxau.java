import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Sapxepxau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        Arrays.sort(a);
        for(String x : a){
            System.out.print(x + " ");
        }
        for(int i = a.length- 1; i >=0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
