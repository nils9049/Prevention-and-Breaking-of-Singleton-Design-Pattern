package com.singlton.breaks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.singlton.creation.SingletonDeclaringStaticFactoryMethodLazy;

public class BreakingSingletonUsingSerialization {

	public static void main(String[] args) {
		
		SingletonDeclaringStaticFactoryMethodLazy s1 = SingletonDeclaringStaticFactoryMethodLazy.getInstance();
		SingletonDeclaringStaticFactoryMethodLazy s2 = null;
		
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.text"));
		    out.writeObject(s1);
		    out.close();
		    ObjectInput in = new ObjectInputStream(new FileInputStream("test.text"));
		    s2 = (SingletonDeclaringStaticFactoryMethodLazy) in.readObject();
		    in.close();
		    
		    System.out.println(s1.hashCode());
		    System.out.println(s2.hashCode());
		    System.out.println(s1 == s2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
