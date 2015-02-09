/**
 * Created by ajonusonis on 2/8/15.
 */
public class Franc {

    private int amount;

    Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc dollar = (Franc)o;
        return amount == dollar.amount;
    }
}
