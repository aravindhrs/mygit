package com.interview.collectionspkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetOpenStockExchange {
	public static void main(String[] args) {
		StockExchange TSE = new StockExchange() {
			
			@Override
			public boolean isClosed() {
				return true;
			}
		};
		
		StockExchange DSE = new StockExchange() {
			
			@Override
			public boolean isClosed() {
				return false;
			}
		};
		
		List<StockExchange> stockList = new ArrayList<>();
		stockList.add(DSE);
		stockList.add(TSE);
		
		System.out.println("All StockExchanges:"+stockList.size());
		
		Iterator<StockExchange> iterator = stockList.iterator();
		while(iterator.hasNext()){
			StockExchange exchange = iterator.next();
			if(exchange.isClosed())
				iterator.remove();
		}
		System.out.println("Opened StockExchange:"+stockList.size());
	}
}
