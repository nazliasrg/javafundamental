package alvira.nazli.javafundamental.tugas4;

public class Person {
    private String namaDepan, namaBelakang, jenisKelamin;
    private final Domisili domisili = new Domisili();

    public Person() {
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setDomisili() {
        domisili.setDomisili();
    }

    public void getDomisili(){
        domisili.getDomisili();
    }

    public String getNamaLengkap(){
        return getNamaDepan() + " " + getNamaBelakang();
    }
}
