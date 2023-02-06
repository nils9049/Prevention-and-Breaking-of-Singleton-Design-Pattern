package com.singlton.breaks;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.singlton.creation.SingletonDeclaringStaticFactoryMethodLazy;

public class BreakingSingletonUsingReflection {

	public static void main(String[] args) {
		SingletonDeclaringStaticFactoryMethodLazy s1 = SingletonDeclaringStaticFactoryMethodLazy.getInstance();
		SingletonDeclaringStaticFactoryMethodLazy s2 = null;

		try {
			Constructor[] cons = s1.getClass().getDeclaredConstructors();
			for (Constructor constructor : cons) {
				constructor.setAccessible(true);
				s2 = (SingletonDeclaringStaticFactoryMethodLazy) constructor.newInstance();
				
				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());
				System.out.println(s1 == s2);
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
