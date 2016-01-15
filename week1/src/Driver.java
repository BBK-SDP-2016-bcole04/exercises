/**
 * Created by digibrose on 05/01/2016.
 */

public class Driver {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();


        Class <BankAccount> baCls = BankAccount.class;

        try {
            //  Object myAccount = baCls.newInstance();
            BankAccount myAccount = (BankAccount) baCls.newInstance();
        //    BankAccount myAccount = new BankAccount();
            aStorage.setValue(myAccount);
// Deposit
            myAccount.deposit(15);
        } catch (InstantiationException e) {
            // ...
        } catch (IllegalAccessException e) {
// ... }

        }
        System.out.println( aStorage.getValue().showBalance() );
        if( aStorage.getClass() == sStorage.getClass() ) {
            System.out.println( "EQUAL" );
        } else {
            System.out.println("NOT EQUAL");
        }

    }
}
