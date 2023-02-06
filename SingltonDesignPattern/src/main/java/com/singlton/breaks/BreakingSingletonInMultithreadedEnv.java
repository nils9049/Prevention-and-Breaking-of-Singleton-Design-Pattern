package com.singlton.breaks;

public class BreakingSingletonInMultithreadedEnv {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable myRun = () -> 
		{
			for (int i = 0; i <= 5; i++) {
				SingletonDeclaringStaticFactoryMethodLazy 
				           s1 = SingletonDeclaringStaticFactoryMethodLazy.getInstance();
				System.out.println("s1 :"+s1.hashCode());
				
			}
		};
		Thread t1 = new Thread(myRun);
		t1.join();
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i <= 5; i++) {
					SingletonDeclaringStaticFactoryMethodLazy 
					            s2 = SingletonDeclaringStaticFactoryMethodLazy.getInstance();
					System.out.println("s2 :"+s2.hashCode());
				}
			}
		});
		t2.sleep(100);

		t1.start();
		t2.start();

	}
}
