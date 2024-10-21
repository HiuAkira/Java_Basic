import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Tskitu {
    public static int check(String s){
        for(int i = 0; i < s.length(); i ++){
            if(!Character.isUpperCase(s.charAt(i))) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        /* Cach 1:
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("");
        for(char x : s.toCharArray()){
            if(map.containsKey(x)){
                System.out.println(x + " " + map.get(x));
                map.remove(x);
            }
        }
        */
        int cnt[] = new int[256];
        for(char x : s.toCharArray()){
            cnt[x]++;
        }
        for(int i = 0; i < 256; i++){
            if(cnt[i] != 0){
                System.out.println((char)i + " " + cnt[i]);
            }
        }
        System.out.println("");
        for(char x : s.toCharArray()){
            if(cnt[x] != 0){
                System.out.println(x + " " + cnt[x]);
                cnt[x] = 0;
            }
        }
    }
}
