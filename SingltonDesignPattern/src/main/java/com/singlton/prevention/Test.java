package com.singlton.prevention;

import com.singlton.creation.SingletonUsingEnum;
import com.singlton.creation.SingletonUsingNestedInnerClass;
import com.singlton.prevent.Singleton;

public class Test {
	
	public static void main(String[] args) {

		
		SingletonUsingNestedInnerClass s1 = SingletonUsingNestedInnerClass.getInstance();
		SingletonUsingNestedInnerClass s2 = SingletonUsingNestedInnerClass.getInstance();
		System.out.println(s1 == s2);
	
		
//		SingletonUsingEnum s1 = SingletonUsingEnum.INSTANCE;		
//		SingletonUsingEnum s2 = SingletonUsingEnum.INSTANCE;
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1 == s2);
		
		
//		SingletonDeclaringStaticFactoryMethodLazy 
//		                        oneDp = SingletonDeclaringStaticFactoryMethodLazy.getInstance();
//		SingletonDeclaringStaticFactoryMethodLazy 
//                                secondDp = SingletonDeclaringStaticFactoryMethodLazy.getInstance();
//		System.out.println(oneDp == secondDp);
	
		
		
//		SingletonDeclaringStaticInstanceAsVolatileEager
//		                       oneDp = SingletonDeclaringStaticInstanceAsVolatileEager.instance;
//		SingletonDeclaringStaticInstanceAsVolatileEager
//                               secondDp = SingletonDeclaringStaticInstanceAsVolatileEager.instance;
//		System.out.println(oneDp == secondDp);
		
		
		
//		SingletonDeclaringStaticInstanceAsFinalEager oneSDP 
//		                            = SingletonDeclaringStaticInstanceAsFinalEager.instance;
//		SingletonDeclaringStaticInstanceAsFinalEager secondSDP 
//                                    = SingletonDeclaringStaticInstanceAsFinalEager.instance;
//		System.out.println(oneSDP == secondSDP);
	}
}
