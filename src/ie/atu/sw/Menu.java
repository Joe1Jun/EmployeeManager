package ie.atu.sw;

import static java.lang.System.out;

import java.util.Scanner;

public class Menu {

	private boolean keepRunning = true;
	private Scanner input;
	private Company company = new Company();

	public Menu() {

		input = new Scanner(System.in);
	}

	public  void start() {

		while (true) {

			showOptions();
			int choice = Integer.parseInt(input.next());
			switch (choice) {

			case 1 -> addEmployee();
			case 2 -> deleteEmployee();
			case 3 -> findById();
			case 4 -> findByFirstName();
			case 5 -> getTotalEmployees();
			case 6 -> keepRunning = false;
			default -> out.println("Invalid selection");

			}
		}

	}// end userMenu

	private void showOptions() {

		System.out.println("----------- Employee Manager -------------");
		System.out.println("Please select an option from below");

		System.out.println("1. Add an employee");
		System.out.println("2. Search for an employee by name");
		System.out.println("3. Search for an employee by Id");

		System.out.println("4. Delete an employee");
		System.out.println("5. List all employees");
		System.out.println("6. Exit");
		input.nextLine(); // Consume newline

	}

	private void addEmployee() {

	}

	private void deleteEmployee() {

	}

	private void findById() {

	}

	private void findByFirstName() {

	}

	private void getTotalEmployees() {

	}

}
