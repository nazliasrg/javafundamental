package alvira.nazli.javafundamental.tugas5;

import alvira.nazli.javafundamental.tugas5.abstractions.BillInterface;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuMakanan implements BillInterface {
    double harga1 = 5000;
    double harga2 = 15000;
    double harga3 = 15000;
    double harga4 = 15000;
    double harga5 = 10000;
    double harga6 = 14000;
    double harga7 = 14000;
    double hargaMenuMakanan = 0;
    Integer menuMakanan;
    Integer jumlahPesanan=0;
    String pilihanMenu;
    String menuUlang;
    ArrayList<String > menuMakananList = new ArrayList<>();
    ArrayList<String> hargaMenuMakananList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    public void cetakMenuMakanan(){
        do{
            System.out.println("============================================================================================");
            System.out.println("                                         MENU MAKANAN                                       ");
            System.out.println("============================================================================================");
            System.out.println("No.  Menu                                               Harga");
            System.out.println(" 1.  Nasi                                               Rp  5.000,-");
            System.out.println(" 2.  Ayam Penyet                                        Rp 15.000,-");
            System.out.println(" 3.  Ayam Geprek                                        Rp 15.000,-");
            System.out.println(" 4.  Ayam Pecak                                         Rp 15.000,-");
            System.out.println(" 5.  Kangkung Tumis                                     Rp 10.000,-");
            System.out.println(" 6.  Terong Goreng Tepung                               Rp 14.000,-");
            System.out.println(" 7.  Jamur Goreng Tepung                                Rp 14.000,-");
            System.out.println("============================================================================================");
            System.out.print("Masukkan menu yang dipilih                      : ");
            menuMakanan = scanner.nextInt();

            switch (menuMakanan){
                case 1 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Nasi";
                    menuMakananList.add(pilihanMenu);
                    hargaMenuMakananList.add(Double.toString(harga1));
                    hargaMenuMakanan += harga1;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga1));
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuMakanan));
                    break;
                case 2 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Ayam Penyet";
                    menuMakananList.add(pilihanMenu);
                    hargaMenuMakananList.add(Double.toString(harga2));
                    hargaMenuMakanan += harga2;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga2));
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuMakanan));
                    break;
                case 3 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Ayam Geprek";
                    menuMakananList.add(pilihanMenu);
                    hargaMenuMakananList.add(Double.toString(harga3));
                    hargaMenuMakanan += harga3;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga3));
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuMakanan));
                    break;
                case 4 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Ayam Pecak";
                    menuMakananList.add(pilihanMenu);
                    hargaMenuMakananList.add(Double.toString(harga4));
                    hargaMenuMakanan += harga4;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga4));
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuMakanan));
                    break;
                case 5 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Kangkung Tumis";
                    menuMakananList.add(pilihanMenu);
                    hargaMenuMakananList.add(Double.toString(harga5));
                    hargaMenuMakanan += harga5;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga5));
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuMakanan));
                    break;
                case 6 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Terong Goreng Tepung";
                    menuMakananList.add(pilihanMenu);
                    hargaMenuMakananList.add(Double.toString(harga6));
                    hargaMenuMakanan += harga6;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga6));
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuMakanan));
                    break;
                case 7 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Jamur Goreng Tepung";
                    menuMakananList.add(pilihanMenu);
                    hargaMenuMakananList.add(Double.toString(harga7));
                    hargaMenuMakanan += harga7;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + df.format(harga7));
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + df.format(hargaMenuMakanan));
                    break;
                default:
                    break;

            }

            System.out.println("============================================================================================");
            System.out.print("Ingin menambah pesanan di menu makanan?  (y/n)  : ");
            menuUlang = scanner.next();
        }
        while(!menuUlang.equalsIgnoreCase("n") && menuUlang.equalsIgnoreCase("y"));
    }

    @Override
    public double setTotalHarga() {
        return this.hargaMenuMakanan;
    }

    @Override
    public ArrayList<String> setPesanan() {
        return this.menuMakananList;
    }

    @Override
    public ArrayList<String> setHargaPesanan() {
        return this.hargaMenuMakananList;
    }
}
