package aravindh.currency.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import aravindh.currency.model.Currency;

@Component
public class ConvertUtil {

	@Autowired
	CurrencyExecutor currencyExecutor;
	
	public Currency convertCurrency(Currency currency){
		String currencyInp1 = currency.getCurrencyCode1().toUpperCase();
		String currencyInp2 = currency.getCurrencyCode2().toUpperCase();
		double amount = currency.getAmount();
		if(amount==0.0)
			amount=1.0;
		double finalAmount=0.0;
		String currencyInp = currencyInp1.concat(currencyInp2);
		
		if(currencyInp1.equalsIgnoreCase(currencyInp2))
			currencyInp = "EQUALS";
		
		switch(currencyInp){
			case "INRUSD":
				currencyExecutor.setAmount(amount);
				currencyExecutor.setCurrencyEnum(CurrencyEnum.INRUSD);
				finalAmount = currencyExecutor.calculate();
				currency.setAmount(amount);
				currency.setConversionrate(0.016);
				currency.setCurrencyCode1("INR");
				currency.setCurrencyCode2("USD");
				currency.setResult(finalAmount);
				return currency;
				
			case "USDINR":
				currencyExecutor.setAmount(amount);
				currencyExecutor.setCurrencyEnum(CurrencyEnum.USDINR);
				finalAmount = currencyExecutor.calculate();
				currency.setAmount(amount);
				currency.setConversionrate(63.94);
				currency.setCurrencyCode1("USD");
				currency.setCurrencyCode2("INR");
				currency.setResult(finalAmount);
				return currency;
				
			case "EQUALS":
				currency.setAmount(amount);
				currency.setConversionrate(1.0);
				currency.setCurrencyCode1(currencyInp1);
				currency.setCurrencyCode2(currencyInp1);
				currency.setResult(finalAmount);
				return currency;
				
			default:
				currency.setAmount(amount);
				currency.setConversionrate(0.0);
				currency.setCurrencyCode1(currencyInp1);
				currency.setCurrencyCode2(currencyInp1);
				currency.setResult(finalAmount);
				return currency;
		}
		
	}
}
