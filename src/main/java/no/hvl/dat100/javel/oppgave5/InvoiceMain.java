package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */
        Customer cust1 = new Customer("m","m@g",1001,PowerAgreementType.POWERSUPPORT);
        Customer cust2 = new Customer("a","a@g",1002,PowerAgreementType.NORGESPRICE);
        Customer cust3 = new Customer("s","s@g",1003,PowerAgreementType.SPOTPRICE);
        Invoice inv1 = new Invoice(cust1,"March",CustomerPowerUsageData.usage_month_customer1,MonthPowerData.powerprices_month);
        Invoice inv2 = new Invoice(cust2,"May",CustomerPowerUsageData.usage_month_customer2,MonthPowerData.powerprices_month);
        Invoice inv3 = new Invoice(cust3,"October",CustomerPowerUsageData.usage_month_customer3,MonthPowerData.powerprices_month);
        inv1.computeAmount();
        inv1.printInvoice();

        Invoice[] invoiceList =  {inv1,inv2,inv3};
        Invoices.processInvoices(invoiceList);

    }
}
