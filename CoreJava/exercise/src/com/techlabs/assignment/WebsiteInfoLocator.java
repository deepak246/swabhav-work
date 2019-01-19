package com.techlabs.assignment;

public class WebsiteInfoLocator {

	public static void main(String[] link) {
		String[] arrOfStr = link[0].split("[.?=&]", -2);

		// for(String a : arrOfStr)
		// System.out.println(a);
		
			if (arrOfStr[1].length() > 0) {
				System.out.println("domain : " + arrOfStr[1]);
			} else {
				System.out.println("No domain specified");
			}
			if (arrOfStr[4].length() > 0 && arrOfStr[3].equalsIgnoreCase("developer")) {
				System.out.println(arrOfStr[3] + " : " + arrOfStr[4]);
			} else {
				System.out.println("No developer specified");
			}
			if (arrOfStr[6].length() > 0 && arrOfStr[5].equalsIgnoreCase("client")) {
				System.out.println(arrOfStr[5] + " : " + arrOfStr[6]);
			} else {
				System.out.println("No client specified");
			}

	}

}
