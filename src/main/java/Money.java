/**
 * Created by ajonusonis on 2/8/15.
 */
public class Money implements Expression{
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
                && currency().equals(money.currency());
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public Expression times(int multiplier){
        return new Money(amount * multiplier, currency);
    }
    
    public Expression plus(Expression addend){
    	return new Sum(this, addend);
    }
    
    public Money reduce(Bank bank, String to){
    	int rate = bank.rate(currency, to);
    	return new Money(amount/rate, to);
    }

    String currency(){
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
