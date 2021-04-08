package alvira.nazli.javafundamental.tugas2.bangunDatar;

public class Persegi {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public double luasPersegi(){
        double luasP;
        luasP = Math.pow(this.sisi, 2);
        return luasP;
    }
}
