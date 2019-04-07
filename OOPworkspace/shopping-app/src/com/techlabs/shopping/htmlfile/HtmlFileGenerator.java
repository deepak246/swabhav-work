package com.techlabs.shopping.htmlfile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.techlabs.shopping.Customer;
import com.techlabs.shopping.Order;

public class HtmlFileGenerator {

	
		FileWriter fw;
		PrintWriter pw;
		
		public void addToHtmlFile(Customer customer) throws IOException{
			fw = new FileWriter("E:\\swabhav-repository\\OOPworkspace\\shopping-app"
					+ "\\data\\cart.html");
			pw = new PrintWriter(fw);
			
			String addOrder = "<p>"+ customer + "<br></p>";
			pw.println("\n" +addOrder);
			pw.close();
		}
		
	

}
