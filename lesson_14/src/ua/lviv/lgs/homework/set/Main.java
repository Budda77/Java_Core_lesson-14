package ua.lviv.lgs.homework.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List <Car> cars = new ArrayList<>();
		cars.add(new Car("Opel", 1985));
		cars.add(new Car("Ford", 2012));
		cars.add(new Car("Volkswagen", 2019));
		cars.add(new Car("Toyota", 2014));
		cars.add(new Car("Hyundai", 2021));
		cars.add(new Car("Nissan", 2022));
		cars.add(new Car("Renault", 1999));		
		cars.add(new Car("Chrysler", 2001));
		cars.add(new Car("Fiat", 2000));
		cars.add(new Car("Citreon", 2008));
		cars.add(new Car("Opel", 1999));
		cars.add(new Car("Nissan", 2001));
		cars.add(new Car("Peugeot", 1997));
		cars.add(new Car("Suzuki", 1996));
		cars.add(new Car("Kia", 2014));
		cars.add(new Car("Aston Martin", 1965));
		cars.add(new Car("Bentley Motors", 2019));
		cars.add(new Car("Aston Martin", 1977));
		cars.add(new Car("Jaguar", 1995));
		cars.add(new Car("Land Rover", 2020));
		cars.add(new Car("Mini Cooper", 2019));
		cars.add(new Car("Porsche", 2014));
		cars.add(new Car("Audi", 2003));
		cars.add(new Car("Kia", 1997));
		cars.add(new Car("Ford", 2020));
		cars.add(new Car("Hyundai", 1995));
		cars.add(new Car("Rolls Royce", 2016));
		cars.add(new Car("Rover", 2021));
		cars.add(new Car("BMW", 2007));
		cars.add(new Car("Alfa Romeo", 1991));
		cars.add(new Car("Ferrari", 2020));
		cars.add(new Car("Lamborghini", 2006));
		cars.add(new Car("Fiat", 2018));
		cars.add(new Car("Peugeot", 2018));
		cars.add(new Car("Suzuki", 2022));
		cars.add(new Car("Maserati", 2015));
		cars.add(new Car("Kia", 2007));
		cars.add(new Car("Opel", 1998));
		cars.add(new Car("Ford", 2001));
		cars.add(new Car("Audi", 2017));
		cars.add(new Car("Mercedes-Benz", 2014));
		cars.add(new Car("MAN", 2019));
		cars.add(new Car("Porsche", 1983));
		
		for (Car car : cars) {
			System.out.println(car);
		}
		
		Collections.sort(cars);
		System.out.println("\nAfter sorting with Comparable:\n");

		
		for (Car car : cars) {			
			System.out.println(car);
		}
		
		Collections.sort(cars);
		System.out.println("\nAfter sorting with Comparator:\n");
		
		Collections.sort(cars, new AutoComparator());
		
		for (Car car : cars) {			
			System.out.println(car);
		}

	}

}
