package alvira.nazli.javafundamental.modifier;

public class Alamat {
    public String jalan, kecamatan, provinsi;

    public void getAlamat(){
        System.out.println("Alamat : " + this.jalan );
        System.out.println("Kecamatan : " + this.kecamatan );
        System.out.println("Provinsi : " + this.provinsi );
    }
}
