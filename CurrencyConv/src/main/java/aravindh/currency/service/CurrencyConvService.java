package aravindh.currency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import aravindh.currency.model.Currency;
import aravindh.currency.util.ConvertUtil;

@Component
public class CurrencyConvService {
	@Autowired
	private ConvertUtil convertUtil;
	
	@Autowired
	Currency currency;

	public ConvertUtil getConvertUtil() {
		return convertUtil;
	}

	public void setConvertUtil(ConvertUtil convertUtil) {
		this.convertUtil = convertUtil;
	}
	
	public Currency getRate(Currency currency){
		return convertUtil.convertCurrency(currency);
	}
}
