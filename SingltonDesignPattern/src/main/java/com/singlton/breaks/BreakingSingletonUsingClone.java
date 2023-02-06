package com.singlton.breaks;

public class BreakingSingletonUsingClone {

	public static void main(String[] args) throws CloneNotSupportedException{

		SingletonDeclaringStaticFactoryMethodLazy 
		                         s1 = SingletonDeclaringStaticFactoryMethodLazy.getInstance();
		SingletonDeclaringStaticFactoryMethodLazy 
		                         s2 = (SingletonDeclaringStaticFactoryMethodLazy) s1.clone();
		
		System.out.println(s1 == s2);
	}
}
