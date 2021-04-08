package alvira.nazli.javafundamental.tugas5;

import alvira.nazli.javafundamental.tugas5.abstractions.BillInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuMinuman implements BillInterface{
    double harga1 = 5000;
    double harga2 = 7000;
    double harga3 = 5000;
    double harga4 = 10000;
    double harga5 = 10000;
    double harga6 = 8000;
    double harga7 = 12000;
    double hargaMenuMinuman = 0;
    Integer menuMinuman;
    Integer jumlahPesanan=0;
    String pilihanMenu;
    String menuUlang;
    ArrayList<String > menuMinumanList = new ArrayList<>();
    ArrayList<String> hargaMenuMinumanList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void cetakMenuMinuman(){
        do{
            System.out.println("============================================================================================");
            System.out.println("                                          MENU MINUMAN                                      ");
            System.out.println("============================================================================================");
            System.out.println("No.  Menu                                               Harga");
            System.out.println(" 1.  Air Mineral                                        Rp  5.000,-");
            System.out.println(" 2.  Teh Manis Dingin                                   Rp  7.000,-");
            System.out.println(" 3.  Teh Manis Panas                                    Rp  5.000,-");
            System.out.println(" 4.  Jus Jeruk                                          Rp 10.000,-");
            System.out.println(" 5.  Lemon Tea                                          Rp 10.000,-");
            System.out.println(" 6.  Teh Botol                                          Rp  8.000,-");
            System.out.println(" 7.  Thai Tea                                           Rp 12.000,-");
            System.out.println("============================================================================================");
            System.out.print("Masukkan menu yang dipilih                      : ");
            menuMinuman = scanner.nextInt();

            switch (menuMinuman){
                case 1 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Air Mineral";
                    menuMinumanList.add(pilihanMenu);
                    hargaMenuMinumanList.add(Double.toString(harga1));
                    hargaMenuMinuman += harga1;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + harga1);
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + hargaMenuMinuman);
                    break;
                case 2 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Teh Manis Dingin";
                    menuMinumanList.add(pilihanMenu);
                    hargaMenuMinumanList.add(Double.toString(harga2));
                    hargaMenuMinuman += harga2;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + harga2);
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + hargaMenuMinuman);
                    break;
                case 3 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Teh Manis Panas";
                    menuMinumanList.add(pilihanMenu);
                    hargaMenuMinumanList.add(Double.toString(harga3));
                    hargaMenuMinuman += harga3;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + harga3);
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + hargaMenuMinuman);
                    break;
                case 4 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Jus Jeruk";
                    menuMinumanList.add(pilihanMenu);
                    hargaMenuMinumanList.add(Double.toString(harga4));
                    hargaMenuMinuman += harga4;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + harga4);
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + hargaMenuMinuman);
                    break;
                case 5 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Lemon Tea";
                    menuMinumanList.add(pilihanMenu);
                    hargaMenuMinumanList.add(Double.toString(harga5));
                    hargaMenuMinuman += harga5;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + harga5);
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + hargaMenuMinuman);
                    break;
                case 6 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Teh Botol";
                    menuMinumanList.add(pilihanMenu);
                    hargaMenuMinumanList.add(Double.toString(harga6));
                    hargaMenuMinuman += harga6;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + harga6);
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + hargaMenuMinuman);
                    break;
                case 7 :
                    jumlahPesanan += 1;
                    pilihanMenu = "Thai Tea";
                    menuMinumanList.add(pilihanMenu);
                    hargaMenuMinumanList.add(Double.toString(harga7));
                    hargaMenuMinuman += harga7;
                    System.out.println("\nAnda memilih menu " + pilihanMenu.toUpperCase() + " , dengan harga : Rp" + harga7);
                    System.out.println("Total pesanan " + jumlahPesanan + " menu, dengan total harga : Rp" + hargaMenuMinuman);
                    break;
                default:
                    break;

            }

            System.out.println("============================================================================================");
            System.out.print("Ingin menambah pesanan di menu minuman?  (y/n)  : ");
            menuUlang = scanner.next();
        }
        while(!menuUlang.equalsIgnoreCase("n") && menuUlang.equalsIgnoreCase("y"));
    }

    @Override
    public double setTotalHarga() {
        return hargaMenuMinuman;
    }

    @Override
    public ArrayList<String> setPesanan() {
        return this.menuMinumanList;
    }

    @Override
    public ArrayList<String> setHargaPesanan() {
        return this.hargaMenuMinumanList;
    }

}
