/*
 * LOGOS It Academy home work 14
 * 
 * */


package ua.lviv.lgs.homework.commodity;

/**
 * @since java 1.8
 * @author Oleksandr
 * @version 1.1
 * */

//import java.util.ArrayList;

import java.util.Scanner;

public class MainCommodity {
	public static void main(String[] args) {
		
		/**
		 * @param input parameters is String and int
		 * @exception InputMismatchException
		 * @exception IndexOutOfBoundsException
		 * 
		 * */

		CargoShipment shipments = new CargoShipment();

		Scanner scanner = new Scanner(System.in);

		while(true) {

			menu();

			switch(scanner.nextInt()) {

			case 1:{

				shipments.addShipment();
				shipments.showShipment();

				break;
			}
			case 2:{

				shipments.addCommodity();
				shipments.showShipment();

				break;
			}
			case 3:{

				shipments.changeCommodity();		

				break;
			}
			case 4:{

				shipments.removeByIndex();		
				shipments.showShipment();

				break;
			}
			case 5:{

				shipments.removeByValue();		
				shipments.showShipment();

				break;
			}
			case 6:{
				System.out.println("Sorted by name:\n");
				shipments.sortByName();		
				shipments.showShipment();

				break;
			}
			case 7:{
				System.out.println("Sorted by length:\n");
				shipments.sortByLength();		
				shipments.showShipment();

				break;
			}
			case 8:{
				System.out.println("Sorted by width:\n");
				shipments.sortByWidth();		
				shipments.showShipment();

				break;
			}
			case 9:{
				System.out.println("Sorted by weigth:\n");
				shipments.sortByWeigth();		
				shipments.showShipment();

				break;
			}
			case 10:{

				shipments.showItem();		

				break;
			}
			case 11:{

				shipments.showShipment();

				break;
			}
			case 12:{

				System.exit(0);	

				break;
			}
			default:{
				System.out.println("Enter the number from 1 to 12.");
			}

			}
		}

	}
	
	static void menu() {
		System.out.println("\nEnter 1 to shipment of the commodity");
		System.out.println("Enter 2 to add the commodity");
		System.out.println("Enter 3 to change the commodity");
		System.out.println("Enter 4 to remove the commodity by Index");
		System.out.println("Enter 5 to remove the commodity by Value");
		System.out.println("Enter 6 to sort by name");
		System.out.println("Enter 7 to sort by length");
		System.out.println("Enter 8 to sort by width");
		System.out.println("Enter 9 to sort by weigth");
		System.out.println("Enter 10 to show selected item");
		System.out.println("Enter 11 to show the all commodity");
		System.out.println("Enter 12 to log out the program");
	}
	
}
