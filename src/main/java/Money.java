/**
 * Created by ajonusonis on 2/8/15.
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money money = (Money)o;
        return amount == money.amount;
    }
}
