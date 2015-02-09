/**
 * Created by ajonusonis on 2/8/15.
 */
public class Franc extends Money{

    Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

}
