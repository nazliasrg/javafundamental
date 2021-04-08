package alvira.nazli.javafundamental.tugas;

import java.util.Scanner;

public class Pendidikan {
    private String sd, smp, sma,s1;
    Scanner scanner = new Scanner(System.in);

    public void cetakPendidikan(){
        this.setPendidikan();
        this.getPendidikan();
    }

    public void setPendidikan(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Isi data pendidikan Anda di bawah ini");
        System.out.print("SD                        : ");
        this.sd = scanner.nextLine();
        System.out.print("SMP                       : ");
        this.smp = scanner.nextLine();
        System.out.print("SMA                       : ");
        this.sma = scanner.nextLine();
        System.out.print("S1                        : ");
        this.s1 = scanner.nextLine();
    }

    public void getPendidikan(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("         BERIKUT DATA PENDIDIKAN ANDA");
        System.out.println("SD                        : " + this.sd.toUpperCase());
        System.out.println("SMP                       : " + this.smp.toUpperCase());
        System.out.println("SMA                       : " + this.sma.toUpperCase());
        System.out.println("S1                        : " + this.s1.toUpperCase());
    }
}
