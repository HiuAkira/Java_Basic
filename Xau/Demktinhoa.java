import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
public class Demktinhoa {
    public static int check(String s){
        for(int i = 0; i < s.length(); i ++){
            if(!Character.isUpperCase(s.charAt(i))) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        int cnt = 0;
        for(String x : a){
            if(check(x) == 1) ++cnt;
        }
        System.out.println(cnt);
    }
}
