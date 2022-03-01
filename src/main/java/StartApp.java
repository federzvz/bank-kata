import Classes.Account;
import Classes.Amount;
import Classes.Date;
import Classes.Statement;

public class StartApp {
    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(Amount.amountOf(1000), new Date("10/01/2021"));
        account.deposit(Amount.amountOf(2000), new Date("13/01/2021"));
        account.withdrawal(Amount.amountOf(500), new Date("14/01/2021"));

        account.printStatement(System.out);
    }

}
