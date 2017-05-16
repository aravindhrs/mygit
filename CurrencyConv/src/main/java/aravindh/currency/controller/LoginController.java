package aravindh.currency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import aravindh.currency.model.Currency;
import aravindh.currency.model.User;
import aravindh.currency.service.CurrencyConvService;

@Controller
public class LoginController {
	
	@Autowired
	CurrencyConvService currencyConvService;
	
	public CurrencyConvService getCurrencyConvService() {
		return currencyConvService;
	}

	public void setCurrencyConvService(CurrencyConvService currencyConvService) {
		this.currencyConvService = currencyConvService;
	}

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/userdata",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user-data");
		return modelAndView.addObject("user",user);
	}
	
	@RequestMapping(value="/currency",method=RequestMethod.GET)
	public ModelAndView convCurrency(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Currency");
		return modelAndView;
	}
	
	@RequestMapping(value="/result",method=RequestMethod.POST)
	public ModelAndView dispCurrency(@ModelAttribute Currency currency){
		ModelAndView modelAndView = new ModelAndView();
		Currency currency2 = currencyConvService.getRate(currency);
		System.out.println("Currency:"+currency2.getResult());
		modelAndView.setViewName("Result");
		return modelAndView.addObject("currency",currency2);
	}
	
	@RequestMapping(value="/currencyInp",method=RequestMethod.GET)
	public ModelAndView convCurrencyInp(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Currency");
		return modelAndView;
	}
}
