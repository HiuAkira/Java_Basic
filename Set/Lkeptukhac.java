import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class Lkeptukhac{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int a[] = new int[1000001];
        for(int i = 0; i < n; i++)
        {
            int m = sc.nextInt();
            set.add(m);
        }
        int t = sc.nextInt();
        for(int z = 0; z < t; z++)
        {
            int x = sc.nextInt();
            if(set.contains(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
