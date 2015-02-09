/**
 * Created by ajonusonis on 2/8/15.
 */
public class Dollar extends Money{

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }


}
