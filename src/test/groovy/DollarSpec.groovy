import spock.lang.Specification
/**
 * Created by ajonusonis on 2/8/15.
 */
class DollarSpec extends Specification {

    def "test multiplication"(){

        given:
        Dollar five = new Dollar(5)

        expect:
        five.times(2) == new Dollar(10)
        five.times(3) == new Dollar(15)

    }

    def "test equality"(){
        expect:
        new Dollar(5) ==  new Dollar(5)
        new Dollar(5) != new Dollar(6)

        new Franc(5) == new Franc(5)
        new Franc(5) != new Franc(6)

        new Franc(5) != new Dollar(5)
    }

    def "test Franc multiplication"(){
        given:
        Franc five = new Franc(5)

        expect:
        five.times(2) == new Franc(10)
        five.times(3) == new Franc(15)
    }
}
