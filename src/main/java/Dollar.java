/**
 * Created by ajonusonis on 2/8/15.
 */
public class Dollar extends Money{

    private String currency;

    Dollar(int amount){
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return this.currency;
    }


}
