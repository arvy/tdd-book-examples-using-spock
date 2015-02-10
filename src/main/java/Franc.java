/**
 * Created by ajonusonis on 2/8/15.
 */
public class Franc extends Money{

    private String currency;

    Franc(int amount){
        this.amount = amount;
        this.currency = "CHF";
    }

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return this.currency;
    }


}
