import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
public class Tsuatktu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        // dem tan so xuat hien trong mang
        for(int i = 0; i < n; i++)
        {
            char x = sc.next().charAt(0);
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else{
                map.put(x,1);
            }
        }
        System.out.println(map.firstKey() + " " + map.get(map.firstKey()));
        System.out.println("");
        System.out.println(map.lastKey() + " " + map.get(map.lastKey()));
        System.out.println("");
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        ArrayList<Map.Entry<Character, Integer>> arr = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : set){
            System.out.println(entry.getKey() + " " + entry.getValue());
            arr.add(entry);
        }
        System.out.println("");
        for(int i = arr.size() - 1; i >= 0; i--){
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
    }
}
