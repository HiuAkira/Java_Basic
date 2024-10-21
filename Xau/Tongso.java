import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Tongso {
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
        long ans = 0;
        for(String x : a){
            ans += Long.parseLong(x);
        }
        System.out.println(ans);
    }
}
