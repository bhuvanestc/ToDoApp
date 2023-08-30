package org.example.data.dao;

import org.example.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonDAOCollection implements PersonDAO
{ private Collection<Person> person;
    public PersonDAOCollection(Collection<Person> person) {
        this.person = person;
    }
    public PersonDAOCollection() {
        super();
    }
    @Override
    public Person findById(Person id) {
        for (Person p1 : person) {
            if (p1.getId() == id.getId()) {
                return p1;
            }
        }
        return null;

    }
    @Override
    public Person findbyEmail(Person email) {
        for(Person p : person)
        {
            if(p.getEmail().equals(email))
            {
                return p;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(person);
    }

    @Override
    public Person remove(Person id)
    {
        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext())
        {
            Person person1 = iterator.next();
            if (person1.equals(id))
            {
                iterator.remove();
                return id;
            }

        }
        return null;
    }
    @Override
    public Person persist(Person person)
    {
        Person P1=new Person(1,"bhuvana","Chandran","bhuva@gmail.com") ;
    this.person.add(P1);
    return P1;
    }
}
