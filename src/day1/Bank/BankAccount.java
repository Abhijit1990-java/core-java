package day1.Bank;

public class BankAccount {
    //States

    //AccountNumber(String)
    private String accountNumber;
    //Account Holder Name(String)
    private String accountHolderName;
    //AccountBalance(Double)
    private double accountBalance;
    //Bank Branch Name(String)
    private String bankBranchName;
    //Branch Code(int/String)
    private String branchCode;
    //Type Of Account(String)
    private String accountType;
    //Interest Rate(Float)
    private Float interestRate;
    //Customer Information(String)
    private String customerInformation;
    //Social Security Number(String)
    private String socialSecurityNumber;

    public String getAccountNumber(){
        return accountNumber;

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

   // public double getAccountBalance() {
    //    return accountBalance;
    // }

   // public void setAccountBalance(double accountBalance) {
      //  if (accountBalance < 0){
          //  throw new RuntimeException("Account is negative");
       // }

      //  this.accountBalance = accountBalance;
   // }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {

        this.bankBranchName = bankBranchName;
    }

    public String getBranchCode() {

        return branchCode;
    }

    public void setBranchCode(String branchCode) {


        this.branchCode = branchCode;
    }

    public String getAccountType() {

        return accountType;
    }

    public void setAccountType(String accountType) {

        this.accountType = accountType;
    }

    public Float getInterestRate() {

        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public String getCustomerInformation() {

        return customerInformation;
    }

    public void setCustomerInformation(String customerInformation) {

        this.customerInformation = customerInformation;
    }

    public String getSocialSecurityNumber() {

        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void transferBalance(BankAccount fromAccount ,BankAccount toAccount,double amountToTransfer ){
        //fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amountToTransfer);
        //toAccount.setAccountBalance(toAccount.getAccountBalance() + amountToTransfer);
        fromAccount.accountBalance = fromAccount.accountBalance - amountToTransfer;
        toAccount.accountBalance = toAccount.accountBalance + amountToTransfer;

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


}



//behavior
//deposit
//balance transfer
