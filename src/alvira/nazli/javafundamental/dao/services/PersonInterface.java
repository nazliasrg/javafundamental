package alvira.nazli.javafundamental.dao.services;

import alvira.nazli.javafundamental.dao.model.Person;

import java.util.List;

public interface PersonInterface {
    List<Person> getAll();
    Person getPerson(Integer id);
    void updatePerson(Person person);
    void removePerson(Integer id);

}
