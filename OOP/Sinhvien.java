public class Sinhvien{
    private String ten, ngaySinh;
    private double gpa;
    private static int soLuong = 0;
    public void dangKyHoc(){
        System.out.println("Sinh vien co the dang ky hoc:");
    }
    public String getGpa(){
        return gpa;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String tenMoi){
        ten = tenMoi;
    }
    Sinhvien(){
        System.out.println("Ham tao duoc goi");
    }
    public String toString(){
        return ten + " " + ngaySinh + " " + String.format("%.1f", gpa);
    }
    Sinhvien(String ten, String ngaySinh, double gpa){
        ++soLuong;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public static void xinChao(){
        System.out.println("Xin chao!");
    }
}
public class Sinhvien extends Nguoi{
    private double gpa;
    public Sinhvien(String ten, String ngaySinh, String diaChi, double gpa){
        super(ten, ngaySinh, diaChi);
        this.gpa = gpa;
    }
}