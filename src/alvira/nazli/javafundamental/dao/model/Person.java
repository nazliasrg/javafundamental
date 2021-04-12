package alvira.nazli.javafundamental.dao.model;

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String nik;

    public Person() {
    }

    public Person(String firstName, String lastName, String nik, Integer id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nik = nik;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
