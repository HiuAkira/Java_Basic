import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Sxvaktao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sinhvien a[] = new Sinhvien[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = sc.nextDouble();
            a[i] = new Sinhvien(ten, ngaySinh, gpa);
        }
        Arrays.sort(a, new Comparator<Sinhvien>() {
            public int compare(Sinhvien a, Sinhvien b){
                if(a.getGpa() < b.getGpa()) return -1;
                else return 1;
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
/*
4
Duong Duc Hieu
19/09/2004
4.0
Nguyen Duc Long
01/01/2004 
4.0
Nguyen Hoai Nam
18/03/2004
3.9
Nguyen Danh Bao Lam
29/09/2004
3.8
*/