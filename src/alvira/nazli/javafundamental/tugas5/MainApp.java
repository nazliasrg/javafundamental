package alvira.nazli.javafundamental.tugas5;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int menuUser;
        double total, totalPPn;
        String menuKembali;
        ArrayList<String> pesananUser = new ArrayList<>();
        ArrayList<String> hargaPesananUser = new ArrayList<>();
        ArrayList<ArrayList<String>> menuPilihanUser = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

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

        scanner.close();

        LocalDateTime timeNow = LocalDateTime.now();
        // Date Formatter
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        String formattedDate = timeNow.format(myFormatObj);


        System.out.println("============================================================================================");
        System.out.println("                                       Cetak Bill Pemesanan                                 ");
        System.out.println("============================================================================================");

        total= menuPahe.setTotalHarga() + menuMakanan.setTotalHarga() + menuMinuman.setTotalHarga();
        totalPPn = 1.1*total;

        menuPilihanUser.add(pesananUser);
        menuPilihanUser.add(hargaPesananUser);

        System.out.println("\nDaftar Menu");
        System.out.println("No.  Menu ");
        for (int i=0; i<menuPilihanUser.get(0).size(); i++) {
                System.out.println(i+1 + ".   " + menuPilihanUser.get(0).get(i) + "    =>   Rp " + df.format(Double.parseDouble(menuPilihanUser.get(1).get(i))));
        }

        System.out.println("\nTotal Harga                    => Rp " + df.format(total));
        System.out.println("Total Harga setelah PPn (10%)  => Rp " + df.format(totalPPn));
        System.out.println("\nWaktu Cetak Bill : " + formattedDate);
        System.out.println("============================================================================================");
    }
}
