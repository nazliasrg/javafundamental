package alvira.nazli.javafundamental.inheritance;

// without constructor
public class Person {
    private String fname, lname;
    public static String VERSION = "1.0";

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFullname(){
        return this.fname + " " + this.lname;
    }

    public void getVersion(){
        System.out.println(VERSION);
    }
}
