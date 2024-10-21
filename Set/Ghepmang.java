import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
public class Ghepmang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int n = sc.nextInt(), m = sc.nextInt();
        for(int i = 0; i < n + m; i++)
        {
            int x = sc.nextInt();
            set.add(x);
        }
        for(int x : set){
           System.out.print(x + " "); 
        }
    }
}
