package alvira.nazli.javafundamental.abstraction.tugasAbstract;

import java.util.ArrayList;

public abstract class BangunDatarAbstract {
     public abstract void setBangunDatar(String bangunDatar);

     public abstract void setGambar();

     void setMenggambar(String menggambarBangunDatar, String nama){
         System.out.println(setNamaBangunDatar(nama) + " adalah " + menggambarBangunDatar);
    }

    static String setNamaBangunDatar(String namaBangunDatar){
         return namaBangunDatar;
    }

    void setKarakteristik(ArrayList<String> karakter, String nama){
         System.out.println("Karakteristik " + setNamaBangunDatar(nama) + " : ");
         for(int i=0; i<karakter.size(); i++){
             System.out.println(i+1 +". " + karakter.get(i));
         }
    }
}
