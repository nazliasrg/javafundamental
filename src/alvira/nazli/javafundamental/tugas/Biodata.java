package alvira.nazli.javafundamental.tugas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Biodata {
    private String namaDepan, namaBelakang, jk, tanggalLahir;
    private final Alamat alamat = new Alamat();

    Scanner scanner = new Scanner(System.in);

    public void cetakBiodata(){
        this.setBiodata();
        this.getBiodata();
    }

    public void setBiodata(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Isi data di bawah ini");
        System.out.print("Nama Depan                : ");
        this.namaDepan = scanner.next();
        System.out.print("Nama Belakang             : ");
        this.namaBelakang = scanner.next();
        System.out.print("Jenis Kelamin (l/p)       : ");
        this.jk = scanner.next();
        System.out.print("Tanggal Lahir (19/08/1999): ");
        this.tanggalLahir = scanner.next();
        alamat.setAlamat();
    }

    public String getJenisKelamin(){
        String jenisKelamin;
        if(this.jk.equalsIgnoreCase("p")){
            jenisKelamin = "Perempuan";
        }
        else if(this.jk.equalsIgnoreCase("l")){
            jenisKelamin = "Laki-laki";
        }
        else{
            jenisKelamin = "Inputan Salah";
        }
        return jenisKelamin;
    }

    public String getUmur() {
        String umur;
        int tahun = Integer.parseInt(this.tanggalLahir.substring(6,10));
        int bulan = Integer.parseInt(this.tanggalLahir.substring(3,5));
        int tanggal = Integer.parseInt(this.tanggalLahir.substring(0,2));

        LocalDate birthDate = LocalDate.of(tahun, bulan, tanggal);
        LocalDate currentDate = LocalDate.now();
        Period diff = Period.between(birthDate, currentDate);

        if (!diff.isNegative()) {
            umur = diff.getYears() + " Tahun, " + diff.getMonths() + " Bulan, " + diff.getDays() + " Hari";
        } else {
            umur = "Inputan Tanggal Lahir Salah";
        }
        return umur;
    }

    public void getBiodata() {
        System.out.println("         BERIKUT BIODATA LENGKAP " + this.namaDepan.toUpperCase());
        System.out.println("Nama Lengkap              : " + this.namaDepan.toUpperCase() + " " + this.namaBelakang.toUpperCase());
        System.out.println("Jenis Kelamin             : " + getJenisKelamin());
        System.out.println("Umur                      : " + getUmur());
        alamat.getAlamat();
    }
}
