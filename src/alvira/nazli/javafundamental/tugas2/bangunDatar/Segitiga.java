package alvira.nazli.javafundamental.tugas2.bangunDatar;

public class Segitiga {
    private int alas, tinggi;

//      using constructor
//    public Segitiga(int alas, int tinggi){
//        this.alas = alas;
//        this.tinggi = tinggi;
//    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double luasSegitiga(){
        double luasAlas;
        luasAlas = (this.alas * this.tinggi)/2;
        return luasAlas;
    }


}
