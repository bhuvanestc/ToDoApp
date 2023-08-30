package org.example.data.dao;

import org.example.model.Person;
import java.util.Collection;

public interface PersonDAO {
    public Person persist(Person person);
    public Person findById(Person id);
    public Person findbyEmail(Person email);
    public Collection<Person> findAll();
    public Person remove (Person id);
}
