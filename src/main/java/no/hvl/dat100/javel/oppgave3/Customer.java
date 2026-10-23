package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // TODO - object variables (attributes)

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;


    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
        // TODO
    }
    // TODO - getter/setter methods for all objectvariables
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustomer_id(){
        return customer_id;
    }
    public PowerAgreementType getAgreement() {
        return agreement;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }
    public void setCustomer_id(int newCustomer_id){
        customer_id = newCustomer_id;
    }
    public void setAgreement(PowerAgreementType newAgreement){
        agreement = newAgreement;
    }


    // TODO - toString method
    public void toStringCustomer(){
        System.out.print("Customer number " + customer_id+"\nName " + name + "\nEmail " + email + "\nAgreement " + agreement +"\n");

    }
}
