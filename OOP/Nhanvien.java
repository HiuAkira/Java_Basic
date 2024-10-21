public class Nhanvien {

    private String manv, ten, gt, ngaySinh, dc, sdt, ngayKy;
    public Nhanvien(String manv, String ten, String gt, String ngaySinh, String dc, String sdt, String ngayKy){
        this.manv = manv;
        this.ten = ten;
        this.gt = gt;
        this.ngaySinh = ngaySinh;
        this.dc = dc;
        this.sdt = sdt;
        this.ngayKy = ngayKy;
    }
    public String toString(){
        return manv + " " + ten + " " + gt + " " + ngaySinh + " " + dc + " " + sdt + " " + ngayKy; 
    }
}