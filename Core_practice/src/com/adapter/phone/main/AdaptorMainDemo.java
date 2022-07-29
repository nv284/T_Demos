package com.adapter.phone.main;

import com.adapter.phone.LightningPhone;
import com.adapter.phone.MicroUsbPhone;
import com.adapter.phone.impl.Android;
import com.adapter.phone.impl.Iphone;
import com.adapter.phone.wrap.LightningToMicroUsbAdapter;

public class AdaptorMainDemo {

	
	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LightningPhone phone) {
		phone.useLightning();
		phone.recharge();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android android = new Android();
		Iphone iPhone = new Iphone();

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

		System.out.println("Recharging iPhone with MicroUsb");
		rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));
	}

}
