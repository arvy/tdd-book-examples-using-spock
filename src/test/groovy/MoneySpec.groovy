import spock.lang.Specification
/**
 * Created by ajonusonis on 2/8/15.
 */
class MoneySpec extends Specification {

    def "multiplication"(){

        given:
        Money five = Money.dollar(5)

        expect:
        five.times(2) == Money.dollar(10)
        five.times(3) == Money.dollar(15)

    }

    def "equality"(){
        expect:
        Money.dollar(5) ==  Money.dollar(5)
        Money.dollar(5) != Money.dollar(6)

        Money.franc(5) != Money.dollar(5)
    }

    def "currency"(){
        expect:
        Money.dollar(1).currency() == "USD"
        Money.franc(1).currency() == "CHF"
    }
	
	def "reduce sum"(){
		given:
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4))
		Bank bank = new Bank()
		Money result = bank.reduce(sum, "USD")
		
		expect:
		Money.dollar(7) == result
	}
	
	def "plus returns sum"(){
		given:
		Money five = Money.dollar(5)
		Expression result = five.plus(five)
		Sum sum = (Sum)result
		
		expect:
		five == sum.augend
		five == sum.addend
	}
	
	def "reduce money"(){
		given:
		Bank bank = new Bank()
		Money result = bank.reduce(Money.dollar(1), "USD")
		
		expect:
		Money.dollar(1) == result
	}
	
	def "reduce money : different currency"(){
		given:
		Bank bank = new Bank()
		bank.addRate("CHF", "USD", 2)
		Money result = bank.reduce(Money.franc(2), "USD")
		
		expect:
		Money.dollar(1) == result
	}
	
	def "test identity rate"(){
		expect:
		1 == new Bank().rate("USD", "USD")
	}
}
