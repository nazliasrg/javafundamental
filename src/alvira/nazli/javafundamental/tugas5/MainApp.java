package alvira.nazli.javafundamental.tugas5;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int menuUser;
        double total;
        String menuKembali;
        ArrayList<String> pesananUser = new ArrayList<>();
        ArrayList<String> hargaPesananUser = new ArrayList<>();
        ArrayList<ArrayList<String>> menuPilihanUser = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        MenuPahe menuPahe = new MenuPahe();
        MenuMakanan menuMakanan = new MenuMakanan();
        MenuMinuman menuMinuman = new MenuMinuman();

        do{
            new MenuResto().cetakMenu();
            System.out.print("Input Menu                                       : ");
            menuUser = scanner.nextInt();
            switch (menuUser) {
                case 1:
                    menuPahe.cetakMenuPahe();
                    pesananUser.addAll(menuPahe.setPesanan());
                    hargaPesananUser.addAll(menuPahe.setHargaPesanan());
                    break;
                case 2:
                    menuMakanan.cetakMenuMakanan();
                    pesananUser.addAll(menuMakanan.setPesanan());
                    hargaPesananUser.addAll(menuMakanan.setHargaPesanan());
                    break;
                case 3 :
                   menuMinuman.cetakMenuMinuman();
                   pesananUser.addAll(menuMinuman.setPesanan());
                   hargaPesananUser.addAll(menuMinuman.setHargaPesanan());
                default:
                    break;
            }
            System.out.println("============================================================================================");
            System.out.print("Kembali ke menu? (y/n)                           : ");
            menuKembali = scanner.next();
        }
        while (!menuKembali.equalsIgnoreCase("n") && menuKembali.equalsIgnoreCase("y"));
        System.out.println("============================================================================================");
        System.out.println("                                        Cetak Bill Pemesanan                                ");
        System.out.println("============================================================================================");

        total= menuPahe.setTotalHarga() + menuMakanan.setTotalHarga() + menuMinuman.setTotalHarga();

        menuPilihanUser.add(pesananUser);
        menuPilihanUser.add(hargaPesananUser);

        System.out.println("Daftar Menu");
        System.out.println("No.  Menu ");
        for (int i=0; i<menuPilihanUser.get(0).size(); i++) {
                System.out.println(i+1 + ".   " + menuPilihanUser.get(0).get(i) + "    =>   Rp " + menuPilihanUser.get(1).get(i));
        }
        System.out.println("Total Harga   => Rp " + total);
        System.out.println("============================================================================================");
    }
}
