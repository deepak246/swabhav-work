package com.techlabs.factorymethod.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.lang.reflect.*;

import com.techlabs.factorymethod.BMWFactory;
import com.techlabs.factorymethod.IAutoFactory;
import com.techlabs.factorymethod.IAutomobile;

public class TestFactoryMethod {

	public static void main(String[] args) throws Exception {
		
		FileReader reader=new FileReader("Resources\\Factory.properties");
		
		Properties p = new Properties();	
		p.load(reader);

		String c1 = p.getProperty("factoryName");
		Class c2 = Class.forName(c1);
		
		System.out.println(c2);
		
		Method method = c2.getDeclaredMethod("getInstance", null);
		IAutoFactory factory =(IAutoFactory) method.invoke(null); 
		IAutomobile auto = factory.make();
		
		auto.start();
		auto.stop();
	}

}
