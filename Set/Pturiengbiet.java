import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class Pturiengbiet{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Long> set = new HashSet<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            long m = sc.nextLong();
            set.add(m);
        }
        for(long x : set)
        {
            System.out.print(x + " ");
        }
    }
}
