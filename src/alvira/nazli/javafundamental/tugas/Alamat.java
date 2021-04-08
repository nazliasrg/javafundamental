package alvira.nazli.javafundamental.tugas;

import java.util.Scanner;

public class Alamat {
    public String jalan, kecamatan, kota;
    Scanner scanner = new Scanner(System.in);

    public void setAlamat(){
        System.out.println("Informasi Domisili");
        System.out.print("Alamat Lengkap            : ");
        this.jalan = scanner.nextLine();
        System.out.print("Kecamatan                 : ");
        this.kecamatan = scanner.nextLine();
        System.out.print("Kota                      : ");
        this.kota = scanner.nextLine();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    public void getAlamat(){
        System.out.println("Alamat Lengkap            : " + this.jalan + ", " + this.kecamatan + ", " + this.kota + ".");
    }
}
