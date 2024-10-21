public class Phanso {

    private long tu,mau;
    public Phanso(long tu,long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public void rutGon(){
        long a = tu, b = mau;
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        tu /= a;
        mau /= a;
    }
    public String toString(){
        return tu + "/" + mau;
    }
}