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
			case 5 -> listAllEmployees();
			case 6 -> keepRunning = false;
			default -> out.println("Invalid selection");

			}
		}

	}// end userMenu

	private void showOptions() {

		System.out.println("----------- Employee Manager -------------");
		System.out.println("Please select an option from below");

		System.out.println("1. Add an employee");
		System.out.println("2. Delete an employee");
		System.out.println("3. Search for an employee by Id");

		System.out.println("4. Find by first name");
		System.out.println("5. List all employees");
		System.out.println("6. Exit");
		

	}

	private void addEmployee() {
		
		
		System.out.println("Enter employees name");
		input.nextLine();
		String name = input.nextLine();
		
	   System.out.println("Enter Id");
		int id = input.nextInt();
		System.out.println("Enter salary");
		double salary = input.nextDouble();
		
		Employee temp = new Employee(name, id, salary);
		
		company.addEmployee(temp);
		
		

	}

	private void deleteEmployee() {
		
		System.out.println("Enter employees full name");
		input.nextLine();
		String name = input.nextLine();
		company.deleteEmployee(name);
		

	}

	private void findById() {
		
		System.out.println("Enter Id");
		int id = input.nextInt();
		company.findEmployeeById(id);

	}

	private void findByFirstName() {
		
		System.out.println("Enter Employees first name");
		
		input.nextLine();
		String name = input.next();
		
		company.findEmployeeByName(name);

	}

	private void listAllEmployees() {

		company.listEmployees();
	}

}
