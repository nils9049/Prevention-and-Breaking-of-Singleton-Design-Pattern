package com.singlton.breaks;

public class SingletonDeclaringStaticFactoryMethodLazy implements Cloneable {

	private static volatile SingletonDeclaringStaticFactoryMethodLazy instance;

	private SingletonDeclaringStaticFactoryMethodLazy() {
	}

	public static SingletonDeclaringStaticFactoryMethodLazy getInstance() {

		if (instance == null) {
			
			synchronized (SingletonDeclaringStaticFactoryMethodLazy.class) {
				
				if(instance == null) {
					instance = new SingletonDeclaringStaticFactoryMethodLazy();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

}
