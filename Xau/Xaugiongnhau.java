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
public class Xaugiongnhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt[] = new int[1001];
        for(char x : s.toCharArray()){
            cnt[x]++;
        }
        long ans = s.length();
        for(int i = 0; i < 256; i++){
            if(cnt[i] != 0){
                ans += 1l * cnt[i] * (cnt[i] - 1) / 2;
            }
        }
        System.out.println(ans);
    }
}
