package no.hvl.dat250.jpa.bankingexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main
{
    private static final String PERSISTENCE_UNIT_NAME = "banking";
    private static EntityManagerFactory factory;

    public static void main( String[] args )
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select t from Person t");
        List<Person> persons = q.getResultList();
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("Size: " + persons.size());

    }
}
