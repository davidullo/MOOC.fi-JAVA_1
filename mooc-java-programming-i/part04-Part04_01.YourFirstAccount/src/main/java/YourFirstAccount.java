
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account davidesAccount = new Account ("Davide's account", 100.00);
        System.out.println(davidesAccount);
        davidesAccount.deposit(20.00);
//        System.out.println("Balance of Davide's account: " + davidesAccount.saldo());
        System.out.println(davidesAccount);
    }
}
