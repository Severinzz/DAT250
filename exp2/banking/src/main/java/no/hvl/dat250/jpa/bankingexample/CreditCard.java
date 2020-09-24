package no.hvl.dat250.jpa.bankingexample;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cardNumber;
    private int limit;
    private int balance;

    @OneToOne
    private Pincode code;

    @ManyToOne
    private Bank bank;

}
