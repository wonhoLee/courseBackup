package main.dollar;

public class Franc extends Money{
	Franc(int amount, String currency){
		super(amount, currency);
	}
	public Money times(int multiplier) {
		return Money.franc(this.amount * multiplier);
	}
}
