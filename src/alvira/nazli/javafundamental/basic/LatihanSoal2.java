package alvira.nazli.javafundamental.basic;

import java.util.Scanner;

public class LatihanSoal2 {

    public static void main(String[] args) {
        int i,j,n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n : ");
        n = scanner.nextInt();

        for (i=0; i<=n; i++){
            for (j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
