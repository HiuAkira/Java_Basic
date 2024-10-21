import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Sinhvien s = new Sinhvien();
        s.dangKyHoc();
        s.setTen("Duong Duc Hieu");
        System.out.println(s.getTen());
        Sinhvien t = new Sinhvien();
        Sinhvien z = new Sinhvien("Hieu", "19/09/2004", 4.0);*/
        Scanner sc = new Scanner(System.in);
        Sinhvien a = new Sinhvien("Hieu", "19/09/2004", 3.9);
        System.out.println(a.getSoLuong());
        Sinhvien b = new Sinhvien("Nam", "18/03/2004",3.8);
        System.out.println(b.getSoLuong());
    }
}