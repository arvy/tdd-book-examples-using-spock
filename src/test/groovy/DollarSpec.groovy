import spock.lang.Specification
/**
 * Created by ajonusonis on 2/8/15.
 */
class DollarSpec extends Specification {

    def "test multiplication"(){

        given:
        Money five = Money.dollar(5)

        expect:
        five.times(2) == Money.dollar(10)
        five.times(3) == Money.dollar(15)

    }

    def "test equality"(){
        expect:
        Money.dollar(5) ==  Money.dollar(5)
        Money.dollar(5) != Money.dollar(6)

        Money.franc(5) == Money.franc(5)
        Money.franc(5) != Money.franc(6)

        Money.franc(5) != Money.dollar(5)
    }

    def "test Franc multiplication"(){
        given:
        Franc five = Money.franc(5)

        expect:
        five.times(2) == Money.franc(10)
        five.times(3) == Money.franc(15)
    }
}
