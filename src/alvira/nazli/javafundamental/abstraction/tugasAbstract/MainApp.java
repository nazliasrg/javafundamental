package alvira.nazli.javafundamental.abstraction.tugasAbstract;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        ArrayList<String> karakterPersegi = new ArrayList<>();
        karakterPersegi.add("Memiliki empat sisi yang sama panjang, AB = BC = CD = AD");
        karakterPersegi.add("Memiliki dua diagonal sama panjang, AC dan BD");
        karakterPersegi.add("Memiliki empat sudut yang sama besar");
        karakterPersegi.add("Kelilingnya adalah 4 x sisi");
        karakterPersegi.add("Luasnya adalah sisi x sisi");

        persegi.setBangunDatar("Persegi");
        persegi.setGambar();
        persegi.setMenggambar("bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang sama panjang dan memiliki empat buah sudut yang kesemuanya adalah sudut siku-siku.", "Persegi");
        persegi.setKarakteristik(karakterPersegi, "Persegi");
        System.out.println();


        Segitiga segitiga = new Segitiga();
        ArrayList<String> karakterSegitiga = new ArrayList<>();
        karakterSegitiga.add("Mempunyai 3 sisi dengan jumlah panjang dua sisinya lebih panjang dari panjang sisi yang lain");
        karakterSegitiga.add("Mempunyai 3 sudut yang jumlah besarnya 180 derajat");

        segitiga.setBangunDatar("Segitiga");
        segitiga.setGambar();
        segitiga.setMenggambar("bangun datar yang dibuat dari tiga sisi yang berupa garis lurus yang saling saling berpotongan dan tiga sudut yang tidak segaris.", "Segitiga");
        segitiga.setKarakteristik(karakterSegitiga, "Segitiga");
        System.out.println();


        Lingkaran lingkaran = new Lingkaran();
        ArrayList<String> karakterLingkaran = new ArrayList<>();
        karakterLingkaran.add("Memiliki jumlah sudut 180 derajat");
        karakterLingkaran.add("Memiliki diameter yang membagi lingkaran menjadi 2 sisi seimbang");
        karakterLingkaran.add("Memiliki jari-jari yang menghubungkan titik pusat dengan titik busur lingkaran");
        karakterLingkaran.add("Diameternya konstant");

        lingkaran.setBangunDatar("Lingkaran");
        lingkaran.setMenggambar("kumpulan titik-titik pada garis bidang datar yang semuanya berjarak sama dari titik tertentu.", "Lingkaran");
        lingkaran.setKarakteristik(karakterLingkaran, "Lingkaran");
        System.out.println();



    }
}
