import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Personxly {

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Personqly a[] = new Personqly[n];
        for(int i = 0; i < n; i++){
            String ma = String.format("%04d", i + 1);
            sc.nextLine();
            String ten, ngaySinh, diaChi, lop;
            double gpa;
            ten = sc.nextLine();
            String s = sc.nextLine();
            lop = sc.nextLine();
            gpa = sc.nextDouble();
            int idx = -1;
            for(int j = 0; j < s.length(); j++){
                if(Character.isAlphabetic(s.charAt(j))){
                    idx = j;
                    break;
                }
            }
            ngaySinh = s.substring(0, idx);
            diaChi = s.substring(idx);
            a[i] = new Personqly(ma, lop, gpa, ten, ngaySinh, diaChi);
            a[i].chuanHoa();
        }
        for(Personqly x : a){
            System.out.println(x);
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Personqly a[] = new Personqly[n];
        for(int i = 0; i < n; i++){
            String ma = String.format("%04d", i + 1);
            sc.nextLine();
            String ten, ngaySinh, diaChi, lop;
            double gpa;
            ten = sc.nextLine();
            ngaySinh = sc.nextLine();
            diaChi = sc.nextLine();
            lop = sc.nextLine();
            gpa = sc.nextDouble();
            a[i] = new Personqly(ma, lop, gpa, ten, ngaySinh, diaChi);
            a[i].chuanHoa();
        }
        Arrays.sort(a, new Comparator<Personqly>() {
            public int compare(Personqly x, Personqly y){
                return x.sxName().compareTo(y.sxName());
            }
        });
        for(Personqly x : a){
            System.out.println(x);
        }
    }
}