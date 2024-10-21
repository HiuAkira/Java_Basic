public class Svien {

    private String ma, ten, lop, ngaySinh;
    private double gpa;
    public Svien(String ma, String ten, String lop, String ngaySinh, double gpa){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        ngaySinh = sb.toString();
    }
    public String toString(){
        return ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.1f", gpa);
    }
}