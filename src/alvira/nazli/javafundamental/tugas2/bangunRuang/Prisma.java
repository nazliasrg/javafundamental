package alvira.nazli.javafundamental.tugas2.bangunRuang;

import alvira.nazli.javafundamental.tugas2.bangunDatar.Segitiga;

public class Prisma extends Segitiga {

    private int sisi1, sisi2, sisi3, tinggiP;
    private int alas, tinggi;
//      using constructor
//        public Prisma(int alas, int tinggi) {
//        super(alas, tinggi);
//    }

    public void setAlas(int alas){
        super.setAlas(alas);
    }

    public void setTinggi(int tinggi){
        super.setTinggi(tinggi);
    }

    public void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }

    public void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }

    public void setSisi3(int sisi3) {
        this.sisi3 = sisi3;
    }

    public int getTinggiP() {
        return tinggiP;
    }

    public void setTinggiP(int tinggiP) {
        this.tinggiP = tinggiP;
    }

    public double kelilingAlas(){
        double kelilingAP;
        kelilingAP = this.sisi1 + this.sisi2 + this.sisi3;
        return kelilingAP;
    }

    public double volumePrisma(){
        double volumep;
        volumep = luasSegitiga() * getTinggiP();
        return volumep;
    }

    public double luasPermukaanPrisma(){
        double luasPP;
        luasPP = (2*luasSegitiga()) + (kelilingAlas() * getTinggiP());
        return luasPP;
    }
}
