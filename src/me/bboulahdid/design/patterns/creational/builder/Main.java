package me.bboulahdid.design.patterns.creational.builder;

public class Main {

	public static void main(String[] args) {
		
		Sandwich.Builder builder = new Sandwich.Builder();
		
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
		
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich.getBread());
		System.out.println(sandwich.getCondiments());
		System.out.println(sandwich.getDressing());
		System.out.println(sandwich.getMeat());
	}

}
