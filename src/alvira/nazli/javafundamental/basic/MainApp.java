package alvira.nazli.javafundamental.basic;

import alvira.nazli.javafundamental.modifier.Person;
import alvira.nazli.javafundamental.modifier.Segitiga;

public class MainApp {
    public static void main(String[] args) {
        HelloWorld objHelloWorld = new HelloWorld();
        Segitiga objSegitiga = new Segitiga();
        Person person = new Person();

        // HelloWorld
            objHelloWorld.name = "Nazli";
            objHelloWorld.setUsia(21);
            HelloWorld.jenisKelamin = "Perempuan";

            System.out.println("Nama : " + objHelloWorld.getName());

            //getter&setter dengan access modifier private
            objHelloWorld.getUsia();

            // contoh pemanggilan attribute dengan type static
            System.out.println("Jenis Kelamin : " + HelloWorld.jenisKelamin);

            // kalau inisialisasi obj kembali, maka data akan null kembali
            objHelloWorld = new HelloWorld();
            System.out.println(objHelloWorld.getName());

        // Segitiga
            objSegitiga.alas = 18;
            objSegitiga.tinggi = 7;
            objSegitiga.drawSegitiga();
            System.out.println("\nLuas segitiga : " + objSegitiga.hitungLuas());

            //constructor
            Segitiga objSegitigaCons = new Segitiga(20, 10);
            System.out.println("\nLuas segitiga (dengan constructor) : " + objSegitigaCons.hitungLuas());

            System.out.println();

        //Person
            person.fname = "Nazli";
            person.lname = "Alvira";
            person.setTahunLahir(1999);
            person.alamat.jalan= "Jalan Balam No. 49";
            person.alamat.kecamatan = "Medan Sunggal";
            person.alamat.provinsi = "Sumatera Utara";

            System.out.println("Nama Lengkap : " + person.fullName());
            System.out.println("Tahun Lahir : " + person.getTahunLahir());
            person.alamat.getAlamat();

    }
}
