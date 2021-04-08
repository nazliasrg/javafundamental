package alvira.nazli.javafundamental.generic;

public class Wilayah {
    private String provinsi;

    public  Wilayah(String provinsi){
        this.provinsi = provinsi;
    }

    public String getProvinsi(){
        return this.provinsi;
    }

    @Override
    public String toString(){
        return this.provinsi;
    }
}
