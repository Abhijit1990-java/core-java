package day1.Bank;

public class CustomerInformation {
    //First Name
    //Middle Name
    //Lastname
    private String Lastname;
    //Contact Number
   private String PhoneNumber;
   //cosigner
    private String cosigner;

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setCosigner(String cosigner) {
        this.cosigner = cosigner;
    }

    public String getCosigner() {
        return cosigner;

    }
}
