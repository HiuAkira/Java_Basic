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
public class Inserta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int[1000001];
        int b[] = new int[1000001];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            map.put(a[i], 1);
        }
        for(int i = 0; i < m; i++)
        {
            b[i] = sc.nextInt();
            if(map.containsKey(b[i])){
                map.put(b[i], 2);
            }
        }
        for(int x : a){
            if(map.containsKey(x) && map.get(x) == 2){
                System.out.print(x + " ");
                map.remove(x);
            }
        }
    }
}
