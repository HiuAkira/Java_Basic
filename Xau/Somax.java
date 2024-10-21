import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Somax {
    public static String chuanhoa(String s){
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    public static String fmax(String a, String b){
        if(a.length() > b.length()) return a;
        if(a.length() < b.length()) return b;
        if(a.compareTo(b) < 0) return b;
        else return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(char x : s.toCharArray()){
            if(Character.isAlphabetic(x)){
                res += " ";
            }
            else{
                res += x;
            }
        }
        String a[] = res.trim().split("\\s+");
        for(int i = 0; i < a.length; i++){
            a[i] = chuanhoa(a[i]);
        }
        String ans = "0";
        for(String x : a){
            ans = fmax(ans, x);
        }
        System.out.println(ans);
    }
}
