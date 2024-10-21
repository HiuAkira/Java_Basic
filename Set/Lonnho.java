import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
public class Lonnho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = sc.nextInt();
        // dem tan so xuat hien trong mang
        for(int i = 0; i < n; i++)
        {
            set.add(sc.nextInt());
        }
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int u = sc.nextInt();
            if(u == 1)
            {
                int x = sc.nextInt();
                set.add(x);
            }
            else if(u == 2){
                int x = sc.nextInt();
                if(set.contains(x)){
                    set.remove(x);
                }
            }
            else if(u == 3){
                System.out.println(set.first());
            }
            else{
                System.out.println(set.last());
            }
        }
    }
}
