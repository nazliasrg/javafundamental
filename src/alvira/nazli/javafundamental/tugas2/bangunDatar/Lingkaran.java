package alvira.nazli.javafundamental.tugas2.bangunDatar;

public class Lingkaran {
    private int r;
    private static final double PHI = 3.14;

    public Lingkaran(int r){
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double luasLingkaran(){
        double luasL;
        luasL = PHI * (Math.pow(r,2));
        return luasL;
    }
}
