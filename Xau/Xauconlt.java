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
    public class Xauconlt {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            s += "@";
            int dem = 1, maxlen = 1;
            String tmp = "";
            tmp += s.charAt(0);
            String res = tmp;
            for(int i = 1; i < s.length(); i ++){
                if(s.charAt(i) == s.charAt(i - 1)){
                    tmp += s.charAt(i);
                    ++dem;
                }
                else{
                    if(dem > maxlen){
                        maxlen = dem;
                        res = tmp;
                    }
                    else if(dem == maxlen){
                        if(res.compareTo(tmp) < 0) res = tmp;
                    }
                    dem = 1;
                    tmp = "";
                    tmp += s.charAt(i);
                }
            }
            System.out.println(res);
        }
    }
