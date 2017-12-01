package me.bboulahdid.design.patterns.creational.singleton;

/**
 * Concepts :
 * - Only one instance created
 * - Guarantees control of a resource
 * - Lazily loaded
 * 
 * Ex : Runtime environment, Logger, Spring Beans
 * 
 * Design :
 * - Class is responsible for life cycle
 * - Static in nature
 * - Needs to be thread safe
 * - Private instance & private constructor
 * - No parameters required for construction
 * 
 * Pitfalls :
 * - Often overused
 * - Difficult to unit test
 * - If not careful, not thread-safe Sometimes confused for Factory
 * - java.util.Calendar is NOT a Singleton (Prototype)
 * 
 * Contrast :
 * - Singleton : Returns same instance (One constructor method - no args), No Interface
 * - Factory : Returns various instances (Multiple constructors), Interface driven, Adaptable to environment more easily
 * 
 */
public class Singleton {
	
	// Eager Loading Vs Lazy Loading :
	
	// Eager Loading is a design pattern in which data initialization/instantiation occurs on the spot,
	// Ex : private static Singleton instance = new Singleton();
	
	// Lazy Loading is a design pattern which is used to defer (delay) initialization of an object as long as it’s possible
	// It improves performance by avoiding unnecessary computation (load on the CPU) and reduces memory requirements
	// Ex: SEE BELOW
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	// A static implementation of the 'getInstance' method
	public static Singleton getInstance() {
		// lazily loaded
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	// Thread safe implementation of the 'getInstance' method
	public static Singleton getThreadSafeInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				// lazily loaded
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}

}
