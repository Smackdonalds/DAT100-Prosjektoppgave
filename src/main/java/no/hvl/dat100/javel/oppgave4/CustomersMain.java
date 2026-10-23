package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */
        Customers CustomerList = new Customers(4);

        System.out.println(CustomerList.countNonNull());

        CustomerList.addCustomer(new Customer("m","m@g",1001,PowerAgreementType.NORGESPRICE));
        CustomerList.addCustomer(new Customer("j","j@g",1002,PowerAgreementType.NORGESPRICE));
        CustomerList.addCustomer(new Customer("h","h@g",1003,PowerAgreementType.NORGESPRICE));

        System.out.println(CustomerList.countNonNull());

        Customer cust1 =CustomerList.getCustomer(1002);
        if (cust1 != null){
            cust1.toStringCustomer();
        }

        Customer cust2 = CustomerList.removeCustomer(1003);

        if (cust2 != null){
            cust2.toStringCustomer();
        }
        System.out.println(CustomerList.countNonNull());

        Customer[] custList = CustomerList.getCustomers();

        System.out.println(custList.length);


    }
}
