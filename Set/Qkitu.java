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
public class Qkitu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else{
                map.put(x, 1);
            }
        }
        int tsMax = 0, tsMin = (int)1e9;
        char charMax = ' ', charMin = ' ';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > tsMax){
                tsMax = entry.getValue();
                charMax = entry.getKey();
            }
            if(entry.getValue() <= tsMin){
                tsMin = entry.getValue();
                charMin = entry.getKey();
            }
        }
        System.out.println(charMax + " " + tsMax);
        System.out.println(charMin + " " + tsMin);
        System.out.println(map.size());
    }
}
