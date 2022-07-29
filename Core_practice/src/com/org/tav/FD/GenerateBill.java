package com.org.tav.FD;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetPlanFactory p = new GetPlanFactory();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the plan for which Bill will generate -> Dom , Comm , Int");
		String planName = sc.nextLine();
		System.out.println(" Enter the number of units ");
		int units = Integer.parseInt(sc.next());
		
		Plan p1 = p.getPlan(planName);
		System.out.println("Bill amount for => "+planName +" of "+units +"unit is :");
		p1.getRate();
		p1.caiculateBill(units);
		
	}

}
