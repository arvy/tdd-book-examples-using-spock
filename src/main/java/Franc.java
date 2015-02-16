/**
 * Created by ajonusonis on 2/8/15.
 */
public class Franc extends Money{

    Franc(int amount, String currency){
        super(amount, currency);
    }

    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    @Override
    String currency() {
        return this.currency;
    }


}
