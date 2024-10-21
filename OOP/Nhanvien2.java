public class Nhanvien2 {

    private String manv, ten, gt, ngaySinh, dc, sdt, ngayKy;
    public Nhanvien2(String manv, String ten, String gt, String ngaySinh, String dc, String sdt, String ngayKy){
        this.manv = manv;
        this.ten = ten;
        this.gt = gt;
        this.ngaySinh = ngaySinh;
        this.dc = dc;
        this.sdt = sdt;
        this.ngayKy = ngayKy;
    }
    public void chuanHoa(){
        String a[] = ten.trim().split("\\s+");
        String name = "";
        for(String x : a){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                name += Character.toLowerCase(x.charAt(i));
            }
            name += " ";
        }
        ten = name.trim();
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        ngaySinh = sb.toString();
        StringBuilder sb1 = new StringBuilder(ngayKy);
        if(sb1.charAt(1) == '/') sb1.insert(0, "0");
        if(sb1.charAt(4) == '/') sb1.insert(3, "0");
        ngayKy = sb1.toString();
    }
    public String toString(){
        return manv + " " + ten + " " + gt + " " + ngaySinh + " " + dc + " " + sdt + " " + ngayKy; 
    }
}