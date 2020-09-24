package no.hvl.dat250.jpa.bankingexample;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;

    @OneToMany
    private List<CreditCard> creditCards;
}
