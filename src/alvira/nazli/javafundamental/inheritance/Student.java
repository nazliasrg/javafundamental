package alvira.nazli.javafundamental.inheritance;

public class Student extends Person2{
    private int sks;
    private String mataKuliah;

    public Student(String fname, String lname) {
        super(fname, lname);
    }

    public int getSks() {
        return this.sks;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return this.mataKuliah;
    }

    public int hitungSks(String mataKuliah){
        return this.sks++;
    }

    public void getStudentData(){
        System.out.println("Jumlah SKS  : " + getSks());
//        System.out.println("Mata Kuliah " + getMataKuliah());
    }

    @Override
    public String getFullname() {
        if (this.sks > 3){
            return "Prof. " + super.getFullname();
        }
        else{
            return super.getFullname();
        }
    }

}
