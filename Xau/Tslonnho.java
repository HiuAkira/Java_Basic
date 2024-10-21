import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
public class Tslonnho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String x : a){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else{
                map.put(x, 1);
            }
        }
        int tsmax = 0, tsmin = Integer.MAX_VALUE;
        String res = "";
        String ans = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() >= tsmax){
                tsmax = entry.getValue();
                res = entry.getKey();
            }
            if(entry.getValue() <= tsmin){
                tsmin = entry.getValue();
                ans = entry.getKey();
            }
        }
        System.out.println(res);
        System.out.println(ans);
    }
}
