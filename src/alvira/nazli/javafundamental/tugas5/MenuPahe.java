package alvira.nazli.javafundamental.tugas5;

import alvira.nazli.javafundamental.tugas5.abstractions.BillInterface;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPahe implements BillInterface {
    double harga1 = 21000;
    double harga2 = 25000;
    double harga3 = 28000;
    double harga4 = 23000;
    double harga5 = 25000;
    private double hargaMenuPahe = 0;
    Integer menuPahe;
    Integer jumlahPesanan=0;
    String pilihanMenu;
    String menuUlang;
    ArrayList<String> menuPaheList = new ArrayList<>();
    ArrayList<String> hargaMenuPaheList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    public void cetakMenuPahe(){

        do{
            System.out.println("============================================================================================");
            System.out.println("                                    MENU PaHe (Paket Hemat)                                 ");
            System.out.println("============================================================================================");
            System.out.println("No.  Menu                                               Harga");
            System.out.println(" 1.  PaHe 1 (Ayam Penyet + Nasi + Teh Manis Dingin)     Rp 21.000,-");
            System.out.println(" 2.  PaHe 2 (Ayam Penyet + Nasi + Jus Jeruk)            Rp 25.000,-");
            System.out.println(" 3.  PaHe 3 (Ayam Geprek + Nasi + Thai Tea)             Rp 28.000,-");
            System.out.println(" 4.  PaHe 4 (Ayam Geprek + Nasi + Teh Botol)            Rp 23.000,-");
            System.out.println(" 5.  PaHe 5 (Ayam Pecak  + Nasi + Lemon Tea)            Rp 25.000,-");
            System.out.println("============================================================================================");
            System.out.print("Masukkan menu yang dipilih                      : ");
            menuPahe = scanner.nextInt();

            switch (menuPahe){
                case 1 :
                    jumlahPesanan += 1;
                    pilihanMenu = "PaHe 1 (Ayam Penyet + Nasi + Teh Manis Dingin)";
                    menuPaheList.add(pilihanMenu);
                    hargaMenuPaheList.add(Double.toString(harga1));
                    hargaMenuPahe += harga1;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga1));
                    System.out.println("Total pesanan pada menu PaHe " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuPahe));
                    break;
                case 2 :
                    jumlahPesanan += 1;
                    pilihanMenu = "PaHe 2 (Ayam Penyet + Nasi + Jus Jeruk)";
                    menuPaheList.add(pilihanMenu);
                    hargaMenuPaheList.add(Double.toString(harga2));
                    hargaMenuPahe += harga2;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga2));
                    System.out.println("Total pesanan pada menu PaHe " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuPahe));
                    break;
                case 3 :
                    jumlahPesanan += 1;
                    pilihanMenu = "PaHe 3 (Ayam Geprek + Nasi + Thai Tea)";
                    menuPaheList.add(pilihanMenu);
                    hargaMenuPaheList.add(Double.toString(harga3));
                    hargaMenuPahe += harga3;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga3));
                    System.out.println("Total pesanan pada menu PaHe " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuPahe));
                    break;
                case 4 :
                    jumlahPesanan += 1;
                    pilihanMenu = "PaHe 4 (Ayam Geprek + Nasi + Teh Botol)";
                    menuPaheList.add(pilihanMenu);
                    hargaMenuPaheList.add(Double.toString(harga4));
                    hargaMenuPahe += harga4;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga4));
                    System.out.println("Total pesanan pada menu PaHe " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuPahe));
                    break;
                case 5 :
                    jumlahPesanan += 1;
                    pilihanMenu = "PaHe 5 (Ayam Pecak  + Nasi + Lemon Tea)";
                    menuPaheList.add(pilihanMenu);
                    hargaMenuPaheList.add(Double.toString(harga5));
                    hargaMenuPahe += harga5;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga5));
                    System.out.println("Total pesanan pada menu PaHe " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuPahe));
                    break;
                default:
                    break;
            }

            System.out.println("============================================================================================");
            System.out.print("Ingin menambah pesanan di menu PaHe?  (y/n)     : ");
            menuUlang = scanner.next();
        }
        while (!menuUlang.equalsIgnoreCase("n") && menuUlang.equalsIgnoreCase("y"));
    }

    @Override
    public double setTotalHarga() {
        return this.hargaMenuPahe;
    }

    @Override
    public ArrayList<String> setPesanan() {
        return this.menuPaheList;
    }

    @Override
    public ArrayList<String> setHargaPesanan() {
        return this.hargaMenuPaheList;
    }
}
