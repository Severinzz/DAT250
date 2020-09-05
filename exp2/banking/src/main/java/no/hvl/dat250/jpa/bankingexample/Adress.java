package no.hvl.dat250.jpa.bankingexample;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    private String street;
    private int number;

    @ManyToMany(mappedBy = "addresses")
    private List<Person> residents;

}
