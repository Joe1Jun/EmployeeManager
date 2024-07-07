package ie.atu.sw;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Menu menu = new Menu();
		Company company = new Company();

		

		menu.start();

		company.listEmployees();
		

	}

	

	
}
