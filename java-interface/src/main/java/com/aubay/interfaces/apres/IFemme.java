package com.aubay.interfaces.apres;

public interface IFemme extends IHumain {
	
	default String description() {
		return IHumain.super.description() + "\nJe suis une femme;";
	}
	
}
