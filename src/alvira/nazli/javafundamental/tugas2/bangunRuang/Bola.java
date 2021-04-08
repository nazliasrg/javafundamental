package alvira.nazli.javafundamental.tugas2.bangunRuang;

import alvira.nazli.javafundamental.tugas2.bangunDatar.Lingkaran;

public class Bola extends Lingkaran {

    public Bola(int r) {
        super(r);
    }

    public double volumeBola(){
        double volumeB;
        volumeB = 4/3* (luasLingkaran()*getR());
        return  volumeB;
    }

    public double luasPermukaanBola(){
        double luasPB;
        luasPB = 4 * luasLingkaran();
        return luasPB;
    }
}
