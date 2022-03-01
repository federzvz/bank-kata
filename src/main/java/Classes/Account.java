package Classes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private Amount amount;
    private List<Statement> statement = new ArrayList<>();

    public Account(Statement statement){
        this.id = (int) Math.random();
        this.amount = statement.getAmount();
        this.statement.add(statement);
    }

    public void deposit(Amount amountParam, Date dateParam) {
        this.amount.setAmount(this.amount.getAmount()+amountParam.getAmount());
        this.statement.add(new Statement(amount, amountParam, dateParam));
    }

    public void withdrawal(Amount amountParam, Date dateParam){
        this.amount.setAmount(this.amount.getAmount()-amountParam.getAmount());
        this.statement.add(new Statement(amount, amountParam, dateParam));
    }

    public void printStatement(PrintStream printStream) {
        printStream.println("DATE   | Credit   | Debit    | balance");
        for(int i=0;i<statement.size();i++){
            printStream.println(statement.get(i).getDate().getDate());
        }
    }
}
