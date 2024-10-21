import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
public class Map{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(3, 5);
        map.put(1, 2);
        map.put(1, 5);
        map.put(2,4);
        map.put(3,4);
        System.out.println(map.size());
        System.out.println(map.get(1));
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for(Map.Entry<Integer, Integer> Entry : set) 
        {
            System.out.println(Entry.getKey() + " " + Entry.getValue());
        }
    }
}
