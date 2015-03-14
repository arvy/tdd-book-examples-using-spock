import spock.lang.Specification
/**
 * Created by ajonusonis on 2/8/15.
 */
class MoneySpec extends Specification {

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

        Money.franc(5) != Money.dollar(5)
    }

    def "test currency"(){
        expect:
        Money.dollar(1).currency() == "USD"
        Money.franc(1).currency() == "CHF"
    }
	
	def "test simple addition"(){
		given:
		Money five = Money.dollar(5)
		Expression sum = five.plus(five)
		Bank bank = new Bank()
		Money reduced = bank.reduce(sum, "USD")
		
		expect:
		Money.dollar(10) == reduced
	}
	
	def "test plus returns sum"(){
		given:
		Money five = Money.dollar(5)
		Expression result = five.plus(five)
		Sum sum = (Sum)result
		
		expect:
		five == sum.augend
		five == sum.addend
	}

}
