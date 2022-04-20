package ua.lviv.lgs.homework.commodity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CargoShipment {

	List<Commodity> shipment;
	
	public CargoShipment() {
		super();
		shipment = new ArrayList<>();
	}
	
	public void addShipment() {
		int numberOfShipment = 5 +(int)(Math.random()*20);

		for(int i = 0; i < numberOfShipment; i++) {
			shipment.add(new Commodity(getRandomCommodity(getRandom(0,11)), getRandom(1,5), getRandom(1,4), getRandom(50,80)));					
		}	
	}
	
	public Commodity createCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the name of commodity:");
		String name = sc.next();			
		System.out.println("Input the Length of the commodity item, meter:");
		int length = sc.nextInt();
		System.out.println("Input the Width of the commodity item, meter:");
		int width = sc.nextInt();
		System.out.println("Input the Weight of the commodity item, kilo:");
		int weight = sc.nextInt();

		return new Commodity(name, length, width, weight);	
	}
	
	public void addCommodity() {
		Commodity tmp = createCommodity();	
		shipment.add(tmp);	
	}
	
	public void showShipment() {
		for (Commodity commodity : shipment) {
			System.out.println(commodity);
		}
	}
	
	public void changeCommodity() {
		System.out.println("Input the Number of the commodity item:");
		
		int number = setNumber();
		if(number > shipment.size()) {
			System.out.println("\nPlease, enter correct Index and try again.\n");
		}else {
			Commodity tmp = createCommodity();
			shipment.set(number, tmp);	
			System.out.println(shipment.get(number));
		}	
	}
	
	public void removeByIndex() {
		System.out.println("Enter index to remove commodity.");
		
		int number = setNumber();		
		if(number < shipment.size()) {
			shipment.remove(number);
		}else {
			System.out.println("Please, enter correct index.\n");
		}		
	}
	
	public void removeByValue() {
		System.out.println("Enter name of the commodity to remove.");	
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		Iterator <Commodity> iterator = shipment.iterator();
		while(iterator.hasNext()) {
			Commodity next = iterator.next();
			
			if(next.getName().contains(name)) {
				iterator.remove();
			}
		}	
	}
	
	public void sortByName() {
		Collections.sort(shipment);
	}
	
	public void sortByLength() {
		Collections.sort(shipment, new CommodityLengthComparator());
	}
	
	public void sortByWidth() {
		Collections.sort(shipment, new CommodityWidthComparator());
	}
	
	public void sortByWeigth() {
		Collections.sort(shipment, new CommodityWeigthComparator());
	}
	
	public void showItem() {
		System.out.println("Enter the index to show selected commodity.");
		
		int number = setNumber();
		
		try {		
				System.out.println(shipment.get(number));
		}catch(IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: " + e.getMessage());
			System.out.println("Please, enter correct index.\n");
		}
		
			/* Option two*/
//		if(number < shipment.size()) {			
//			System.out.println(shipment.get(number));
//		}else {
//			System.out.println("Please, enter correct index.\n");
//		}
		
	}

	private int setNumber() {
		int number = 0;
		try {
			Scanner sc = new Scanner(System.in);
			 number = sc.nextInt();
			
		} catch(InputMismatchException e) {
			System.out.println("Please, enter the correct Number of the commodity item:");
			return setNumber();
		}

		return number;
	}

	public int getRandom(int min, int max) {
		
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
	
	public String getRandomCommodity(int id) {
		
		String [] goods = {"Bananas", "Sugar", "Petrol", "Oil", "Fabrics", "Leather", "Shoes", "Nuts", "Alcogol", "Beverages", "Cotton", "Grains"};		
		String NameOfGood = goods[id];		
		return NameOfGood;
	}
	
	
	

}
