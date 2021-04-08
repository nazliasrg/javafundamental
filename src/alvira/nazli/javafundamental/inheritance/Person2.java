package alvira.nazli.javafundamental.inheritance;

//with constructor
public class Person2 {
    private String fname, lname;
    //Version get from Person

    //constructor
    public Person2(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public void getVersion(){
        System.out.println(Person.VERSION);
    }

    public String getFullname(){
        return this.fname + " " + this.lname + ", S.Kom";
    }

}
