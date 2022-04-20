package ua.lviv.lgs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetApplication {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Person> lhs = new LinkedHashSet<>();
		
		lhs.add(new Person("Aduardo", 25));
		lhs.add(new Person("Alexandro", 32));
		lhs.add(new Person("Lisa", 18));
		lhs.add(new Person("Torben", 73));
		lhs.add(new Person("Rasmus", 42));
		
		for (Person person : lhs) {
			System.out.println(person);
		}
		
		HashSet<Person> hs = new HashSet<>();
		
		hs.add(new Person("Aduardo", 25));
		hs.add(new Person("Alexandro", 32));
		hs.add(new Person("Lisa", 18));
		hs.add(new Person("Torben", 73));
		hs.add(new Person("Rasmus", 42));
		
		System.out.println("\nHasSet:");
		
		for (Person person : hs) {
			System.out.println(person);
		}
		
	}

}
