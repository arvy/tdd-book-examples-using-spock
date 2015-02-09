import spock.lang.Specification
/**
 * Created by ajonusonis on 2/8/15.
 */
class DollarSpec extends Specification {

    def "test multiplication"(){

        given:
        Dollar five = new Dollar(5)

        when:
        five.times(2)

        then:
        five.amount == 10
    }
}
