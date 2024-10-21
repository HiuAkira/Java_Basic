import java.util.HashSet;
import java.util.Scanner;
public class Xaucoban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String s = "i love you";
        System.out.println(s);
        System.out.println(s.length());
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }*/
        /*int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.toUpperCase(); // in thanh xau in hoa
        //s = s.toLowerCase(); // in thanh xau in thuong
        String t = "@@@@";
        s = s + t;
        System.out.println(s);
        //Character.isDigit()// ktra ham in hoa
        //Character.isAlphabetic() // ktra in hoa in thuong lan lon
        String m = "1231231231";
        int n = Integer.parseInt(m);// chuyen xau thanh so
        String a[] = {"he","he","ba","me","chi","anh"};
        HashSet<String> set = new HashSet<>();*/
        /*
        String z = "xin chao the gioi";
        String b[] = z.split("\\z+");
        for(int i = 0; i < b.length; i++)
        {
            System.out.print(b[i]);
        }*/
        String s = "28tech";
        String t = "28tech";
        if(s.compareTo(t) == 0){ // so sanh 2 xau
            System.out.println("YES");
        }
    }
}