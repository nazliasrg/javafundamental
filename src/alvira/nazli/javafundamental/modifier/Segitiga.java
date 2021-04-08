package alvira.nazli.javafundamental.modifier;

public class Segitiga {
    public float alas, tinggi;
    public float luas;

    public Segitiga(){

    }

    // constructor yang ada parameter, kalau mau pake ini harus ada custroctor kosong juga seperti diatas
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float hitungLuas(){
        luas = (alas*tinggi)/2;
        return luas;
    }

    public void drawSegitiga(){
        System.out.println("ini adalah segitiga");
    }




}
