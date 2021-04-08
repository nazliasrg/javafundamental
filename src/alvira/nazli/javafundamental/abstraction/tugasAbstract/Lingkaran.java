package alvira.nazli.javafundamental.abstraction.tugasAbstract;

import java.util.ArrayList;

public class Lingkaran extends BangunDatarAbstract {
    @Override
    public void setBangunDatar(String bangunDatar) {
        System.out.println("--------------" + bangunDatar.toUpperCase() + "--------------");
    }

    @Override
    public void setGambar() {

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
