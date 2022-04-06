package se.lexicon.Sudipta;

public class Customer {

    private String name;
    private String email;
    private int phoneNUmber;

    public Customer() {
    }

    public Customer(String name, String email, int phoneNUmber ){
            this.name = name;
            this.email = email;
            this.phoneNUmber = phoneNUmber;
        }
        public String getCustomerInformation() {
            return "Customer Information :-- Name : > " + name + " , email : >" + email + "  , Phone number " + phoneNUmber;

        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(int phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    }
