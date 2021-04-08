package alvira.nazli.javafundamental.tugas;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args){
        int menuUser;
        String menuKembali;

        do {
            new Menu().cetakMenu();
            System.out.print("Input Menu                : ");
            Scanner scanner = new Scanner(System.in);
            menuUser = scanner.nextInt();

            switch (menuUser) {
                case 1:
                    new Biodata().cetakBiodata();
                    break;
                case 2:
                    new Pendidikan().cetakPendidikan();
                    break;
                case 3 :
                    System.exit(0);
                default:
                    break;
            }
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.print("Kembali ke menu? (y/n)    : ");
            menuKembali = scanner.next();
        }
        while(!menuKembali.equalsIgnoreCase("n") && menuKembali.equalsIgnoreCase("y"));
        System.exit(0);
    }
}
