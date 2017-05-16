package aravindh.currency.util;

import org.springframework.stereotype.Component;

@Component
public class CurrencyExecutor {
	private double amount;
	private CurrencyEnum currencyEnum;

	public double calculate() {
		return currencyEnum.calculate(amount);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public CurrencyEnum getCurrencyEnum() {
		return currencyEnum;
	}

	public void setCurrencyEnum(CurrencyEnum currencyEnum) {
		this.currencyEnum = currencyEnum;
	}
}
