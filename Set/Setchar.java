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
public class Setchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Character> set = new TreeSet<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            set.add(c);
        }
        System.out.println(set.size());
        ArrayList<Character> list = new ArrayList<>();
        for(char x : set){
            System.out.print(x + " ");
            list.add(x);
        }
        System.out.println("");
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
