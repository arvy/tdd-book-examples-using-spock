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
        new Dollar(5).equals(new Dollar(5))

        and:
        ! new Dollar(5).equals(new Dollar(6))
    }
}
