import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
public class Chuanhoaten {
    public static String convert(String s){
        String a[] = s.split("\\s+");
        String name = "";
        for(String x : a){
            name += Character.toUpperCase(x.charAt(0));
            for(int j = 1; j < x.length(); j++){
                name += Character.toLowerCase(x.charAt(j));
            }
            name += " ";
        }
        return name.trim(); // loai bo dau cach thua o dau va cuoi xau
    }
    public static String chuanhoa(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convert(s));
        String ns = sc.nextLine();
        System.out.println(chuanhoa(ns));
    }
}
