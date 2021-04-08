package alvira.nazli.javafundamental.abstraction.tugasAbstract;

import java.util.ArrayList;

public class Segitiga  extends BangunDatarAbstract{

    @Override
    public void setBangunDatar(String bangunDatar) {
        System.out.println("--------------" + bangunDatar.toUpperCase() + "--------------");
    }

    @Override
    public void setGambar() {
        for (int i=0; i<4; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    void setMenggambar(String menggambarBangunDatar, String nama) {
        super.setMenggambar(menggambarBangunDatar, nama);
    }

    @Override
    void setKarakteristik(ArrayList<String> karakter, String nama) {
        super.setKarakteristik(karakter, nama);
    }
}
