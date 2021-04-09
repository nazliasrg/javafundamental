package alvira.nazli.javafundamental.tugas4;

import alvira.nazli.javafundamental.tugas4.abstractions.StudentInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Course implements StudentInterface {
    Integer matkulPilihan;
    Integer jumlahSks=0;
    String menuCourse;
    ArrayList<String> mataKuliahStudent = new ArrayList<>();
    ArrayList<String> sksMataKuliahStudent = new ArrayList<>();
    ArrayList<String> ruanganMataKuliahStudent = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void menuCourse(){
        do{
            System.out.println("============================================================================================");
            System.out.println("                                 DAFTAR MATA KULIAH YANG DIAMBIL                            ");
            System.out.println("============================================================================================");
            System.out.println("No. Mata Kuliah                     Jumlah SKS     Ruangan");
            System.out.println("1.  Algoritma & Pemrograman            28          Basic");
            System.out.println("2.  Konsep Dasar Pemrograman           20          Fortran");
            System.out.println("3.  Pemrograman Berorientasi Objek     38          Java");
            System.out.println("4.  Pemrograman Web I                  35          Pascal");
            System.out.println("5.  Pemrograman Web II                 35          VB");
            System.out.println("6.  Matematika Diskrit                 30          Pascal");
            System.out.println("7.  Matematika Dasar                   25          Delphi");
            System.out.println("8.  Analisis Numerik                   30          VB");
            System.out.println("9.  Mobile Programming                 34          Basic");
            System.out.println("10. Natural Language Processing        35          Java");
            System.out.println("============================================================================================");
            System.out.print("Pilih mata kuliah                  : ");
            matkulPilihan = scanner.nextInt();

            switch (matkulPilihan){
                case 1 :
                    jumlahSks += 28;
                    mataKuliahStudent.add("Algoritma & Pemrograman");
                    sksMataKuliahStudent.add("28");
                    ruanganMataKuliahStudent.add("Basic");
                    System.out.println("Anda memilih mata kuliah Algoritma & Pemrograman dengan bobot 28 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 2 :
                    jumlahSks += 20;
                    mataKuliahStudent.add("Konsep Dasar Pemrograman");
                    sksMataKuliahStudent.add("20");
                    ruanganMataKuliahStudent.add("Fortran");
                    System.out.println("Anda memilih mata kuliah Konsep Dasar Pemrograman dengan bobot 20 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 3 :
                    jumlahSks += 38;
                    mataKuliahStudent.add("Pemrograman Berorientasi Objek");
                    sksMataKuliahStudent.add("38");
                    ruanganMataKuliahStudent.add("Java");
                    System.out.println("Anda memilih mata kuliah Pemrograman Berorientasi Objek dengan bobot 38 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 4 :
                    jumlahSks += 35;
                    mataKuliahStudent.add("Pemrograman Web I");
                    sksMataKuliahStudent.add("35");
                    ruanganMataKuliahStudent.add("Pascal");
                    System.out.println("Anda memilih mata kuliah Pemrograman Web I dengan bobot 35 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 5 :
                    jumlahSks += 35;
                    mataKuliahStudent.add("Pemrograman Web II");
                    sksMataKuliahStudent.add("35");
                    ruanganMataKuliahStudent.add("VB");
                    System.out.println("Anda memilih mata kuliah Pemrograman Web II dengan bobot 35 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 6 :
                    jumlahSks += 30;
                    mataKuliahStudent.add("Matematika Diskrit");
                    sksMataKuliahStudent.add("30");
                    ruanganMataKuliahStudent.add("Pascal");
                    System.out.println("Anda memilih mata kuliah Matematika Diskrit dengan bobot 30 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 7 :
                    jumlahSks += 25;
                    mataKuliahStudent.add("Matematika Dasar");
                    sksMataKuliahStudent.add("25");
                    ruanganMataKuliahStudent.add("Delphi");
                    System.out.println("Anda memilih mata kuliah Matematika Dasar dengan bobot 25 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 8 :
                    jumlahSks += 30;
                    mataKuliahStudent.add("Analisis Numerik");
                    sksMataKuliahStudent.add("30");
                    ruanganMataKuliahStudent.add("VB");
                    System.out.println("Anda memilih mata kuliah Analisis Numerik dengan bobot 30 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 9 :
                    jumlahSks += 34;
                    mataKuliahStudent.add("Mobile Programming");
                    sksMataKuliahStudent.add("34");
                    ruanganMataKuliahStudent.add("Basic");
                    System.out.println("Anda memilih mata kuliah Mobile Programming dengan bobot 34 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                case 10 :
                    jumlahSks += 35;
                    mataKuliahStudent.add("Natural Language Processing");
                    sksMataKuliahStudent.add("35");
                    ruanganMataKuliahStudent.add("Java");
                    System.out.println("Anda memilih mata kuliah Natural Language Processing dengan bobot 35 sks");
                    System.out.println("\nJumlah mata kuliah yang sudah dipilih : " + mataKuliahStudent.size());
                    System.out.println("Jumlah sks yang sudah dipilih         : " + jumlahSks);
                    break;
                default:
                    break;

            }

            System.out.println("============================================================================================");
            System.out.print("Ingin menambah mata kuliah lagi?  (y/n)        : ");
            menuCourse = scanner.next();
        }
        while (!menuCourse.equalsIgnoreCase("n") && menuCourse.equalsIgnoreCase("y"));
    }

    @Override
    public void getDataStudent() {

    }

    @Override
    public Integer setCourse() {
        return jumlahSks;
    }

    @Override
    public ArrayList<String> setMataKuliahPilihanStudent() {
        return this.mataKuliahStudent;
    }

    @Override
    public ArrayList<String> setSksMataKuliahPilihanStudent() {
        return this.sksMataKuliahStudent;
    }

    @Override
    public ArrayList<String> setRuanganMataKuliahPilihanStudent() {
        return this.ruanganMataKuliahStudent;
    }
}
