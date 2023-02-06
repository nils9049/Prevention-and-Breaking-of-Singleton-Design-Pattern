package com.singlton.prevent;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	public static volatile Singleton instance;

	// preventing to create another object by using serialization and
	// deserialization
	public Object readResolve() {
		return instance;
	}

	// preventing to create another object by using clone()
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

	// preventing to create another object by using reflection
	private Singleton() {
		throw new InstantiationError("You are not allowed to create a object of singleton class");
	}

	public static Singleton getInstance() {
		if (instance == null) {

			// double-lock checking
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
