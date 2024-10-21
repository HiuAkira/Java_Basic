import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Sapxeph {
    public static int Checkdx(String s){
        int l = 0, r = s.length()-1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r) ) return 0;
            ++l;
            --r;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String x : a){
            if(Checkdx(x) == 1 && set.contains(x) == false){
                list.add(x);
                set.add(x);
            }
        }
        Collections.sort(list, new Comparator<String>() {
            public int compare(String x, String y){
                return x.length() - y.length();
            }
        });
        for(String x : list){
            System.out.print(x + " ");
        }
    }
}
