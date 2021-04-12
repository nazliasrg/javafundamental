package alvira.nazli.javafundamental.dao.controller;

import alvira.nazli.javafundamental.dao.model.Person;
import alvira.nazli.javafundamental.dao.services.PersonServiceImpl;

public class PersonController {
    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();

        //get all person yg bertipe objek
        System.out.println("List All Person by Object");
        System.out.println( personService.getAll());

        // get all person
        System.out.println("\nList All Person Value");
        for (Person element: personService.getAll()) {
            System.out.println(element.getId() + ". " + element.getFirstName() + " " + element.getLastName() + ", " + element.getNik());
        }

        // get by id
        Person personById = personService.getPerson(2);
        System.out.println("\nFirst Name Person ke 2 : " + personById.getFirstName());

        // update
        personById.setFirstName("Muhammad Rafli");
        personById.setNik("7837382922");
        personService.updatePerson(personById);

        // get all person after update
        System.out.println("\nList All Person Value After Updated");
        for (Person element: personService.getAll()) {
            System.out.println(element.getId() + ". " + element.getFirstName() + " " + element.getLastName() + ", " + element.getNik());
        }

        // delete
        System.out.println();
        personService.removePerson(1);

        // get all person
        System.out.println("\nList All Person Value After Deleted");
        for (Person element: personService.getAll()) {
            System.out.println(element.getId() + ". " + element.getFirstName() + " " + element.getLastName() + ", " + element.getNik());
        }
    }
}
