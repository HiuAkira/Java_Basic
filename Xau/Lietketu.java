import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
public class Lietketu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '.' || c == ',' || c == '!' || c == '?') t += " ";
            else t += c;
        }
        String a[] = t.split("\\s+");
        for(String x : a){
            System.out.print(x + " ");
        }
    }
}
