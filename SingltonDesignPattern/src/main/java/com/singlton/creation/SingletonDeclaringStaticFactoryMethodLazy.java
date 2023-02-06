package com.singlton.creation;

import java.io.Serializable;

public class SingletonDeclaringStaticFactoryMethodLazy implements Cloneable, Serializable{

	private static SingletonDeclaringStaticFactoryMethodLazy instance;

	private SingletonDeclaringStaticFactoryMethodLazy() {
	}

	public static SingletonDeclaringStaticFactoryMethodLazy getInstance() {

		if (instance == null) {
			instance = new SingletonDeclaringStaticFactoryMethodLazy();
		}
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
