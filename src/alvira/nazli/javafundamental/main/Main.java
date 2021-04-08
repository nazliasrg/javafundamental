package alvira.nazli.javafundamental.main;

import alvira.nazli.javafundamental.inheritance.Person;
import alvira.nazli.javafundamental.inheritance.Person2;
import alvira.nazli.javafundamental.inheritance.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFname("Nazli");
        person.setLname("Alvira");
        System.out.println(person.getFullname());

        Person2 person2 = new Person2("Nazli", "Alvira");
        System.out.println(person2.getFullname());

        Student student = new Student("Nazliii", "Alvira");
        //        error karna attribute di student tidak semua ada di person
        //        Student student2 = new Person2("Nazli", "Siregar");
        //        bisa karena attribute person semua ada di student
        //        Person2 student3 = new Student("Nazli", "Alvira", 144);

        student.hitungSks("KDP");
        student.hitungSks("PIK");
        student.hitungSks("PBO");
        student.hitungSks("MPR");
        System.out.println(student.getFullname());
        student.getStudentData();

    }
}
