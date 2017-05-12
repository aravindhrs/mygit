package com.interview.nashornscript;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
	public static void main(String[] args) {
		try {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
			Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);		    
		    bind.put("message", "Welcome to Javascript Nashorn");
		    bind.put("name", "Aravindh");
			Object script = engine.eval(new FileReader("D:\\GitHub\\JavaInterview\\nashron\\FirstNashron.js"));
			System.out.println("Javascript:\n-----------\n"+script.toString()+"\n-------------");
			Invocable invocable = (Invocable) engine;
			
			invocable.invokeFunction("functionDemo1", "Nashorn");
			Object result1 = invocable.invokeFunction("functionDemo3", "Nashorn","Secondtry");
			System.out.println("Secondtry:"+result1);
			Object result=invocable.invokeFunction("getMsg","NewTry");
			System.out.println("New Try:"+result.toString());
		} catch (FileNotFoundException | ScriptException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
