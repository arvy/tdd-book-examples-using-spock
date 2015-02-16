/**
 * Created by ajonusonis on 2/8/15.
 */
public class Dollar extends Money{

    Dollar(int amount, String currency){
        super(amount, currency);
    }

    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return this.currency;
    }


}
