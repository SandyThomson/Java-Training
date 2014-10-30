package mcm.chapter1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Question 10 in the Java A Beginner's Guide Chapter 1 Slightly
 * over engineered - just for fun
 * 
 * @author Malcolm.Murray
 *
 */
public class MeasurementTables {

	/**
	 * Method to print a table of gallons to litres
	 */
	public static void printGalToLitTable(int noGallonsToSho){
		
		//Initialise GalToLit object
		MeasurementConverter converter = new MeasurementConverter();
		
		//Print table header
		System.out.println("|-------------------------------|  ");
		System.out.println("|   Gallons     |     Litres    |  ");
		System.out.println("|-------------------------------|  ");
		
		//Setup a Decimal Formatter so we only get 2 dec places, otherwise we get a lot.
		DecimalFormat df = new DecimalFormat( "#.00" );
		
		for(int gallons = 1; gallons <= noGallonsToSho; gallons++){
			System.out.println("|\t"+gallons+"\t|\t"+df.format(converter.convert(gallons, MeasurementConverter.GALTOLITRERATIO))+"\t|");
		
			//If gallons modulo 10 is 0
			//Prints a new line every 10 entries in the table
			if(gallons % 10 == 0 ){
				System.out.println("|-------------------------------|  ");
			}
		
		}
	}
	
	
	/**
	 * Method to print a table of inches in metres
	 * @param noInchesToShow
	 */
	public static void printInchToMetreTable(int noInchesToShow){
		
		//Initialise GalToLit object
		MeasurementConverter converter = new MeasurementConverter();
		
		//Print table header
		System.out.println("|-------------------------------|  ");
		System.out.println("|    Inch       |     Metre     |  ");
		System.out.println("|-------------------------------|  ");
		
		//Setup a Decimal Formatter so we only get 2 dec places, otherwise we get a lot.
		DecimalFormat df = new DecimalFormat( "#0.00" );
		
		for(int inch = 1; inch <= noInchesToShow; inch++){
			System.out.println("|\t"+inch+"\t|\t"+df.format(converter.convert(inch, MeasurementConverter.INCHTOMETRERATIO))+"\t|");
		
			//If gallons modulo 10 is 0
			//Prints a new line every 10 entries in the table
			if(inch % 12 == 0 ){
				System.out.println("|-------------------------------|  ");
			}
		}
	}
	
	/**
	 * Method to print the inches to metre table for a given number of feet
	 * @param noFeetToPrint
	 */
	public static void printInchToMetreTableInFeet(int noFeetToPrint){
		//Work out how many inches we need to print
		int inches = noFeetToPrint * 12;
		
		printInchToMetreTable(inches);
		
	}


	/**
	 * Use this to run the program and get some output
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		
		boolean exitApp = false;
		
		Scanner scanner = new Scanner(System.in);
		
		while(!exitApp){
			System.out.println("*********************************");
			System.out.println("*** Measurement Table Printer ***");
			System.out.println("*********************************");
			
			System.out.println("Select which measurements you would like to print:");
			System.out.println("1) for Gallons To Litres");
			System.out.println("2) for Inches to Metres");
			System.out.println("Type exit to quit.");
			
			String menuChoice;
			menuChoice = scanner.next();
			
			try{
				//N.B., uses the snazzy new Java switch on string functionality, because I wanted to try it
				switch(menuChoice){
					case "1":
						String noGallonsString;
						System.out.println("How many gallons do you want to print?");
						noGallonsString = scanner.next();
					
						//Try converting the input to an integer - if this fails then we just go back to the main menu
						MeasurementTables.printGalToLitTable(Integer.parseInt(noGallonsString));
						
						break;
					
					case "2":
						System.out.println("Would you like to print a specific number of inches? Or a number of feet's worth of conversion?");
						System.out.println("1) for inches");
						System.out.println("2) for feet");
						System.out.println("Type menu to go back or exit to quit.");
					
						menuChoice = scanner.next();
						switch (menuChoice) {
						case "1":
							String noInches;
							System.out.println("How many inches do you want to print?");
							noInches = scanner.next();
							
							//Try converting the input to an integer - if this fails then we just go back to the main menu
							MeasurementTables.printInchToMetreTable(Integer.parseInt(noInches));
							
							break;
						
						case "2":
							String noFeet;
							System.out.println("How many feet do you want to print?");
							noFeet = scanner.next();
							
							//Try converting the input to an integer - if this fails then we just go back to the main menu
							MeasurementTables.printInchToMetreTableInFeet(Integer.parseInt(noFeet));
						default:
							break;
						}
						break;
						
					case "exit":
						exitApp = true;
						System.out.println("Bye...");
						break;
					default:
						System.out.println("I don't recognise that command, try again!");
				}
			}catch(NumberFormatException ne){
				System.out.println("Duh! You entered an invalid value, returning to the main menu!");
			}
		}	
		
	}

}
