package alvira.nazli.javafundamental.tugas4;

import java.util.Scanner;

public class Domisili {
    public String jalan, kecamatan, kota;
    Scanner scanner = new Scanner(System.in);

    public void setDomisili(){
        System.out.println("Informasi Domisili");
        System.out.print("Alamat Lengkap        : ");
        this.jalan = scanner.nextLine();
        System.out.print("Kecamatan             : ");
        this.kecamatan = scanner.nextLine();
        System.out.print("Kota                  : ");
        this.kota = scanner.nextLine();
    }

    public void getDomisili(){
        System.out.println("Alamat Lengkap           : " + this.jalan + ", " + this.kecamatan + ", " + this.kota + ".");
    }
}
