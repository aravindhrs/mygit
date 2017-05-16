package aravindh.currency.model;

import org.springframework.stereotype.Component;

@Component
public class Currency {
	private String currencyCode1;
	private String currencyCode2;
	private double amount;
	private double conversionrate;
	private double result;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrencyCode1() {
		return currencyCode1;
	}
	public void setCurrencyCode1(String currencyCode1) {
		this.currencyCode1 = currencyCode1;
	}
	public String getCurrencyCode2() {
		return currencyCode2;
	}
	public void setCurrencyCode2(String currencyCode2) {
		this.currencyCode2 = currencyCode2;
	}
	public double getConversionrate() {
		return conversionrate;
	}
	public void setConversionrate(double conversionrate) {
		this.conversionrate = conversionrate;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
}
