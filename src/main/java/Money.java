/**
 * Created by ajonusonis on 2/8/15.
 */
public abstract class Money {
    protected int amount;
    protected String currency;

    protected Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money)o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    String currency(){
        return currency;
    }
}
