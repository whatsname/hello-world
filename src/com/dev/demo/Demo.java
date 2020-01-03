package com.dev.demo;

public class Demo {

	public static void main(String[] args) {
		
		Demo dev = new Demo();
				
		String nameUser = dev.getName("Sittipong");
		System.out.println("hello this : " + nameUser);

		String nameCompany = dev.getCompany("P.E.");
		System.out.println("hello this : " + nameCompany);
		
		System.out.println("test git action");
		
	}
	
	private String getName(String userName) {
		return userName;
	}
	
	private String getCompany(String companyName) {
		return companyName;
	}

}
