package ua.lviv.lgs;

import java.util.TreeSet;

public class TreeSetAplication {

	public static void main(String[] args) {
		
		TreeSet<Person> ts = new TreeSet<>(new PersonAllFeildsComparator());
		ts.add(new Person("Aduardo", 25));
		ts.add(new Person("Alexandro", 32));
		ts.add(new Person("Lisa", 18));
		ts.add(new Person("Torben", 73));
		ts.add(new Person("Alexandro", 55));
		ts.add(new Person("Rasmus", 42));
		
		for (Person person : ts) {
			System.out.println(person);
		}

	}

}
