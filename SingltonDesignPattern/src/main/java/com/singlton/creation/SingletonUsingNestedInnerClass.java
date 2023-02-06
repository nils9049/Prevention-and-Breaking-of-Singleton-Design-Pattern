package com.singlton.creation;

public class SingletonUsingNestedInnerClass {

	private static class NestedSingletonHolder {
		public static SingletonUsingNestedInnerClass 
		                           instance = new SingletonUsingNestedInnerClass();
	}

	public static SingletonUsingNestedInnerClass getInstance() {
		return NestedSingletonHolder.instance;
	}

	private SingletonUsingNestedInnerClass() {

	}

}
