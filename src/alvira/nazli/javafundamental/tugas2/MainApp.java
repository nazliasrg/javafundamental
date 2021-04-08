package alvira.nazli.javafundamental.tugas2;

import alvira.nazli.javafundamental.tugas2.bangunRuang.Bola;
import alvira.nazli.javafundamental.tugas2.bangunRuang.Kubus;
import alvira.nazli.javafundamental.tugas2.bangunRuang.Prisma;

public class MainApp {
    public static void main(String[] args) {

        Prisma prisma = new Prisma();
        prisma.setAlas(10);
        prisma.setTinggi(6);
        prisma.setSisi1(6);
        prisma.setSisi2(5);
        prisma.setSisi3(12);
        prisma.setTinggiP(10);
        System.out.println("-------------Segitiga & Prisma-----------");
        System.out.println("Luas Segitiga         : " + prisma.luasSegitiga());
        System.out.println("Volume Prisma         : " + prisma.volumePrisma());
        System.out.println("Luas Permukaan Prisma : " + prisma.luasPermukaanPrisma());

        Bola bola = new Bola(7);
        System.out.println();
        System.out.println("-------------Lingkaran & Bola------------");
        System.out.println("Luas Lingkaran        : " + bola.luasLingkaran());
        System.out.println("Volume Bola           : " + bola.volumeBola());
        System.out.println("Luas Permukaan Bola   : " + bola.luasPermukaanBola());

        Kubus kubus = new Kubus(10);
        System.out.println();
        System.out.println("-------------Persegi & Kubus------------");
        System.out.println("Luas Persegi          : " + kubus.luasPersegi());
        System.out.println("Volume Kubus          : " + kubus.volumeKubus());
        System.out.println("Luas Permukaan Kubus  : " + kubus.luasPermukaanKubus());
    }
}
