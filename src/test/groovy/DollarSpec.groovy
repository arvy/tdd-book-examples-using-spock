import spock.lang.Specification
/**
 * Created by ajonusonis on 2/8/15.
 */
class DollarSpec extends Specification {

    def "test multiplication"(){

        given:
        Dollar five = new Dollar(5)

        when:
        Dollar product = five.times(x)

        then:
        product.amount == y

        where:
        x || y
        2 || 10
        3 || 15
    }

    def "test equality"(){
        expect:
        new Dollar(5).equals(new Dollar(5))

        and:
        ! new Dollar(5).equals(new Dollar(6))
    }
}
