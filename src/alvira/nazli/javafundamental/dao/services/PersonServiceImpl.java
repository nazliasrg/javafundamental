package alvira.nazli.javafundamental.dao.services;

import alvira.nazli.javafundamental.dao.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonInterface{
    List<Person> personList;

    public PersonServiceImpl(){
        personList = new ArrayList<>();
        Person person = new Person("Nazli", "Alvira", "7862673", 1);
        Person person2 = new Person("Rafli", "Ezra", "7890673", 2);
        personList.add(person);
        personList.add(person2);
    }

    @Override
    public List<Person> getAll() {
        return this.personList;
    }

    @Override
    public Person getPerson(Integer id) {
        return personList.get(id-1);
    }

    @Override
    public void updatePerson(Person person) {
        personList.get(person.getId()-1).setFirstName(person.getFirstName());
        personList.get(person.getId()-1).setLastName(person.getLastName());
        personList.get(person.getId()-1).setNik(person.getNik());
        System.out.println("Person " + person.getFirstName() + ", updated!");
    }

    @Override
    public void removePerson(Integer id) {
        personList.remove(id-1);
        System.out.println("Person " + id + " has been deleted!");
    }
}