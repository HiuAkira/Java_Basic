import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
public class Ghepxau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.next();
        }
        Arrays.sort(a, new Comparator<String>() {
            public int compare(String u, String v){
                String uv = u + v;
                String vu = v + u;
                return vu.compareTo(uv);
            }
        });
        for(String x : a) {
            System.out.print(x);
        }
    }
}
