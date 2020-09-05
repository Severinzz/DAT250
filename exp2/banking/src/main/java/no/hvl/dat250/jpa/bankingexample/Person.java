package no.hvl.dat250.jpa.bankingexample;

import javax.persistence.*;
import java.util.List;

import lombok.Data;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;

    @ManyToMany
    @JoinTable(name = "join_pers_adr",
            joinColumns = @JoinColumn(name = "person_fk"),
            inverseJoinColumns = @JoinColumn(name = "adress_fk"))
    private List<Adress> addresses;

    @OneToMany
    private List<CreditCard> cards;
}
