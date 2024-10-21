import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Emailvapassh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer>  map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine().toLowerCase();
            String a[] = s.split("\\s+");
            int sz = a.length;
            String email = a[sz - 2];
            for(int j = 0; j < sz - 2; j++){
                email += a[j].charAt(0);
            }
            if(map.containsKey(email) == false){
                System.out.println(email + "@xyz.edu.vn");
                map.put(email, 1);
            }
            else{
                map.put(email, map.get(email) + 1);
                System.out.println(email + map.get(email) + "@xyz.edu.vn");
            }
            String b[] = a[sz - 1].split("/");
            for(String x : b){
                System.out.print(Integer.parseInt(x));
            }
            System.out.println("");
        }
    }
}
