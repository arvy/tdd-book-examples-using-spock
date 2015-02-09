/**
 * Created by ajonusonis on 2/8/15.
 */
public class Dollar {

    int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    void times(int multiplier){
        amount *= multiplier;
    }
}
