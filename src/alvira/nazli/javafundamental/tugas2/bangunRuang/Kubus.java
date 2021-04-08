package alvira.nazli.javafundamental.tugas2.bangunRuang;

import alvira.nazli.javafundamental.tugas2.bangunDatar.Persegi;

public class Kubus extends Persegi {
    public Kubus(int sisi) {
        super(sisi);
    }

    public double volumeKubus(){
        double volumeK;
        volumeK = luasPersegi() * getSisi();
        return volumeK;
    }

    public double luasPermukaanKubus(){
        double luasPK;
        luasPK = 6 * luasPersegi();
        return  luasPK;
    }


}
