package org.example;
import org.example.model.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
class PersonTest {
    @Test
    void setFirstname() {
        Person Bhuvana = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com");

        assertEquals("Bhuvana",Bhuvana.getFirstname());
    }
    @Test
    void setFirstNameWithNullValue() {
        Person p = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com"); // Assuming you have a Person class

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            p.setFirstname(null);
        });
        Assertions.assertEquals("FirstName cannot be null", thrown.getMessage());
    }




@Test
    void setLastname() {
        Person Bhuvana = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com");

       assertEquals("Chandran",Bhuvana.getLastname());

    }
    @Test
    void setLastNameWithNullValue() {
        Person p = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com"); // Assuming you have a Person class

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            p.setLastname(null);
        });
        Assertions.assertEquals("LastName cannot be null", thrown.getMessage());
    }

    @Test
    void setEmail() {
        Person Bhuvana = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com");

        assertEquals("bhuva@gmail.com",Bhuvana.getEmail());

    }

    @Test
    void setEmailWithNullValue() {
        Person p = new Person(1,"Bhuvana","Chandran","bhuva@gmail.com"); // Assuming you have a Person class

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            p.setEmail(null);
        });
        Assertions.assertEquals("Email cannot be null", thrown.getMessage());
    }
}
