import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Sapxep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        Arrays.sort(a);
        for(String x : a){
            System.out.print(x + " ");
        } 
        System.out.println("");
        Arrays.sort(a, new Comparator<String>() {
            public int compare(String u, String v){
                if(u.length() != v.length()) return u.length() - v.length(); 
                return u.compareTo(v);
            }
        });
        for(String x : a){
            System.out.print(x + " ");
        } 
        
    }
}
