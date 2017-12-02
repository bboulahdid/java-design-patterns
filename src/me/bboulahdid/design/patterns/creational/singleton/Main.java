package me.bboulahdid.design.patterns.creational.singleton;

public class Main {

	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getThreadSafeInstance();
		Singleton singleton2 = Singleton.getThreadSafeInstance();

		System.out.println(singleton1);
		System.out.println(singleton2);

		System.out.println(singleton1 == singleton2);


		System.out.println("# Using enums :");
		SingletonEnum.INSTANCE.setValue(10);
		System.out.println(SingletonEnum.INSTANCE.getValue());
	}

}
