package Classes;

public class Amount {
    Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amountParam) {
        this.amount = amountParam;
    }

    public Amount(double amountParam) {
        this.amount=amountParam;
    }

    public Amount(Double amountParam) {
        this.amount = amountParam;
    }

    public static Amount amountOf(double amountParam){
        return new Amount(amountParam);
    }


}
