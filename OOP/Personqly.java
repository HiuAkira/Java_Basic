import java.util.ArrayList;
public class Personqly extends Persons{
    private String ma,lop;
    private double gpa;
    public Personqly(String ma, String lop, double gpa, String ten, String ngaySinh, String diaChi){
        super(ten, ngaySinh, diaChi);
        this.ma = ma;
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}