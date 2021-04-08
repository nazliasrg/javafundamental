package alvira.nazli.javafundamental.tugas5;

import java.util.Scanner;

public class MainApp {
    double totalHarga = 0;

    public double getTotalHarga(double totalHarga){
        this.totalHarga += totalHarga;
        return this.totalHarga;
    }

    public static void main(String[] args) {
        int menuUser;
        String menuKembali;
        Scanner scanner = new Scanner(System.in);

        do{
            new MenuResto().cetakMenu();
            System.out.print("Input Menu                                       : ");
            menuUser = scanner.nextInt();
            switch (menuUser) {
                case 1:
                    new MenuPahe().cetakMenuPahe();
                    break;
                case 2:
                    System.out.println("Menu Makanan");
                    break;
                case 3 :
                    System.out.println("Menu Minuman");
                default:
                    break;
            }
            System.out.println("============================================================================================");
            System.out.print("Kembali ke menu? (y/n)                            : ");
            menuKembali = scanner.next();
        }
        while (!menuKembali.equalsIgnoreCase("n") && menuKembali.equalsIgnoreCase("y"));
        System.out.println("============================================================================================");
        System.out.print("Cetak Bill");
        System.out.println("============================================================================================");
    }
}
