package com.org.tav.day8.dp;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public CheckBox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}

}
