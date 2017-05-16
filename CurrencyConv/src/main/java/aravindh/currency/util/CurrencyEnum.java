package aravindh.currency.util;

public enum CurrencyEnum implements CurrencyInt{	
	INRUSD{
		@Override
		public double calculate(double amount) {
			if(amount==0.0)
				amount=1.0;
			return amount*0.016;
		}
	},
	
	USDINR{
		@Override
		public double calculate(double amount) {
			if(amount==0.0)
				amount=1.0;
			return amount*63.94;
		}
	}
}
