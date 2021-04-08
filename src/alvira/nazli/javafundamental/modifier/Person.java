package alvira.nazli.javafundamental.modifier;

public class Person {
    public String fname;
    public String lname;
    public Alamat alamat = new Alamat();
    private int tahunLahir;

    public Person() {
        super();
    }

    public Person(String fname, String lname, int tahunLahir) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.alamat = alamat;
        this.tahunLahir = tahunLahir;
    }

    public String fullName(){
        return this.fname + " " + this.lname;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
}
