package com.org.tav.singlep;

public class Singleton {
	
	private static Singleton instance;
	public String value;

	private Singleton(String value) {
		//super();
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		this.value=value;
	}
	
	public static Singleton getInstance(String value) {
		if(instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}

}
