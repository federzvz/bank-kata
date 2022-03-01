package Classes;

public class Statement {
    private Amount balance;
    private Amount amount;
    private Date date;

    public Statement() {
        this.amount=new Amount(0);
        this.balance= new Amount(0);
        this.date= new Date();
    }

    public Statement(Amount balance, Amount amount, Date date) {
        this.balance = balance;
        this.amount = amount;
        this.date = date;
    }

    public Amount getBalance() {
        return balance;
    }

    public void setBalance(Amount balance) {
        this.balance = balance;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
