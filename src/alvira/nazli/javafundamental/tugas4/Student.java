package alvira.nazli.javafundamental.tugas4;

import alvira.nazli.javafundamental.tugas4.abstractions.StudentInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person implements StudentInterface {
    private String  jk, nim;
    Scanner scanner = new Scanner(System.in);

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setStudent(){
        String namaDepanMhs, namaBelakangMhs;
        System.out.println("Tolong isi data diri berikut");
        System.out.print("Nama Depan            : ");
        namaDepanMhs= scanner.nextLine();
        super.setNamaDepan(namaDepanMhs);
        System.out.print("Nama Belakang         : ");
        namaBelakangMhs = scanner.nextLine();
        super.setNamaBelakang(namaBelakangMhs);
        System.out.print("Jenis Kelamin (l/p)   : ");
        jk = scanner.next();
        super.setJenisKelamin(jk);
        System.out.print("NIM                   : ");
        nim = scanner.next();
        this.setNim(nim);
        super.setDomisili();
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

    @Override
    public String getNamaLengkap() {
        return super.getNamaLengkap();
    }

    @Override
    public void getDataStudent() {
        System.out.println("Jenis Kelamin            : " + getJenisKelamin());
        System.out.println("NIM                      : " + this.getNim());
        super.getDomisili();
    }

    @Override
    public Integer setCourse() {
        return 0;
    }

    @Override
    public ArrayList<String> setMataKuliahPilihanStudent() {
        return null;
    }

    @Override
    public ArrayList<String> setSksMataKuliahPilihanStudent() {
        return null;
    }

    @Override
    public ArrayList<String> setRuanganMataKuliahPilihanStudent() {
        return null;
    }
}
