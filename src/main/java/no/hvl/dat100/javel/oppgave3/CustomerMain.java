package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
        Customer customer1 = new Customer("Mikkel","Mikkel.B@hvl.no",1,PowerAgreementType.SPOTPRICE);

        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getCustomer_id());
        System.out.println(customer1.getAgreement());

        customer1.setName("Mikel");
        customer1.setEmail("Mikel.B@hvl.no");
        customer1.setCustomer_id(2);
        customer1.setAgreement(PowerAgreementType.NORGESPRICE);

        customer1.toStringCustomer();
    }
}
