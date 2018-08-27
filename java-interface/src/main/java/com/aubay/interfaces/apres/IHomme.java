package com.aubay.interfaces.apres;

public interface IHomme extends IHumain {
	
	default String description() {
		return IHumain.super.description() + "\nJe suis un homme;";
	}
	
}
