public class Khoitao{
    private String ten,ngaySinh;
    private double d1,d2,d3;
    Khoitao(String ten, String ngaySinh, double d1, double d2, double d3){
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    /*public void output(){
        System.out.println(ten + " " + ngaySinh + " " + String.format("%.1f",(d1 + d2 + d3)));
    }*/
    public String toString(){
        return ten + " " + ngaySinh + " " + String.format("%.1f", (d1 + d2 + d3));
    }
}