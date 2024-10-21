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
public class Ghepso {
    public static String chuanhoa(String s){
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                res += x;
            }
            else{
                res += " ";
            }
        }
        String a[] = res.split("\\s+");
        for(int i = 0; i < a.length; i++){
            a[i] = chuanhoa(a[i]);
        }
        Arrays.sort(a, new Comparator<String>() {
            public int compare(String u, String v){
                String uv = u + v;
                String vu = v + u;
                return vu.compareTo(uv);
            }
        });
        for(String x : a){
            System.out.print(x);
        }
    }
}
