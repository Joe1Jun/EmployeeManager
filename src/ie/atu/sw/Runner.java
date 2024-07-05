package ie.atu.sw;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Company company = new Company();

		Employee employee1 = new Employee("John Murphy", 1234, 40000);
		Employee employee2 = new Employee("Joe Junker", 2345, 50000);

		company.addEmployee(employee1);
		company.addEmployee(employee2);

		userMenu(company);

		company.listEmployees();
		

	}

	public static void userMenu(Company company) {

		Scanner input = new Scanner(System.in);

		System.out.println("----------- Employee Manager -------------");
		System.out.println("Please select an option from below");

		while (true) {
			int choice;

			System.out.println("1. Add an employee");
			System.out.println("2. Search for an employee by name");
			System.out.println("3. Search for an employee by Id");
			
			System.out.println("4. Delete an employee");
			System.out.println("5. List all employees");
			System.out.println("6. Exit");
			choice = input.nextInt();
			input.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.println("Enter a name");
				String name = input.nextLine();
				System.out.println("Enter an Id");
				int id = input.nextInt();
				System.out.println("Enter the salary");
				double salary = input.nextDouble();
				Employee newEmployee = new Employee(name, id, salary);
				company.addEmployee(newEmployee);
				break;
			case 2:
				System.out.println("Enter name to search for");

				String nameSearch = input.nextLine();
				company.findEmployeeByName(nameSearch);
				break;
			case 3:
				System.out.println("Enter an ID to search for");
				int findId = input.nextInt();
				input.nextLine(); // Consume newline
				company.findEmployeeById(findId);
				break;
			case 4:
				System.out.println("Enter Id to delete");

				int deleteId = input.nextInt();
				input.nextLine(); // Consume newline
				break;

			case 5:
				System.out.println("List all employees");
				company.listEmployees();
				
				break;
			case 6: 
				System.out.println("Exiting....");
				
				input.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");

			}

		}

	}
}
