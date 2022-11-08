package day1.Bank;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount abhijitAccount = new BankAccount();
        //abhijitAccount.accountNumber = "4567980";
        abhijitAccount.setAccountNumber("4567980");

        abhijitAccount.setAccountHolderName("Abhijit Tumbahangphe");
        abhijitAccount.setAccountType("checking");
       // abhijitAccount.setAccountBalance(5000);
        abhijitAccount.setBankBranchName("Irving");
        abhijitAccount.setBranchCode("Belt line");
        abhijitAccount.setInterestRate(10f);
        abhijitAccount.setSocialSecurityNumber("1234567");

        CustomerInformation abhijitInformation = new CustomerInformation();
        abhijitInformation.setPhoneNumber("4355983731");
        abhijitInformation.setCosigner("Joe Biden");

        abhijitAccount.setCustomerInformation(abhijitInformation.toString());

        BankAccount minaAccount = new BankAccount();
        minaAccount.setAccountNumber("4059972");
        minaAccount.setAccountBalance(1000);

        double amountToTransfer = (600);
        BankAccount sampleAccount = new BankAccount();


      //  abhijitAccount.setAccountBalance(abhijitAccount.getAccountBalance() - 600);
      //  minaAccount.setAccountBalance(minaAccount.getAccountBalance() + 600);
        sampleAccount.transferBalance(abhijitAccount,minaAccount,amountToTransfer);
        System.out.println("abhijit Balance:" + abhijitAccount.getAccountBalance());
        System.out.println("mina Balance: " + minaAccount.getAccountBalance());
       // abhijitAccount.setAccountBalance(abhijitAccount.getAccountBalance() +600);
        //minaAccount.setAccountBalance(minaAccount.getAccountBalance() -600);
        sampleAccount.transferBalance(abhijitAccount,minaAccount,amountToTransfer);
        System.out.println("abhijit Balance:" + abhijitAccount.getAccountBalance());
        System.out.println("mina Balance: " + minaAccount.getAccountBalance());


    }
}
