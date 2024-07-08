package ie.atu.sw;

public class Company {

	private final int INITIAL_CAPACITY = 1;
	private Employee employees[] = new Employee[INITIAL_CAPACITY];
	

	public void addEmployee(Employee employee) {
        // Check if the array is full
		for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        
        int index = expandArray();
        employees[index] = employee;
    }

    private int expandArray() {
        // Create a new array with double the size of the current array
        Employee[] newEmployees = new Employee[employees.length * 2];
        // Copy the current employees to the new array
        for (int i = 0; i < employees.length; i++) {
			newEmployees[i] = employees[i];
		}
		
		int index = employees.length;
		employees = newEmployees;
		
		return index;
	}
        
       

	public void findEmployeeById(int id) {

		boolean found = false;

		for (int i = 0; i < employees.length; i++) {
			if (id == employees[i].getId()) {
				System.out.println("Employee: " + id + " found ");
				found = true;
				break; // Exit the loop once the employee is found
			}
		}

		if (!found) {
			System.out.println("Employee not found");
		}
	}

	public void listEmployees() {

		for (int i = 0; i < employees.length; i++) {

			System.out.println(employees[i]);
		}
	}

	public void findEmployeeByName(String name) {
		boolean found = false;

		for (int i = 0; i < employees.length; i++) {
			if (name.equalsIgnoreCase(employees[i].getName())) {
				System.out.println("Employee with name " + name + " found ");
				found = true;
				break; // Exit the loop once the employee is found
			}
		}

		if (!found) {
			System.out.println("Employee not found");
		}
	}
	
	public void compactArray() {
	    int shiftIndex = 0;
	    for (int i = 0; i < employees.length; i++) {
	        if (employees[i] != null) {
	            employees[shiftIndex++] = employees[i];
	        }
	    }
	    // Fill the rest of the array with nulls
	    for (int i = shiftIndex; i < employees.length; i++) {
	        employees[i] = null;
	    }
	}
	
	public void deleteEmployee(String name) {
	    boolean found = false;

	    for (int i = 0; i < employees.length; i++) {
	        if (employees[i] != null && name.equals(employees[i].getName())) {
	            System.out.println("Employee " + employees[i].getName() + " deleted from system");
	            employees[i] = null;
	            found = true;
	            compactArray(); // Compact the array after deletion
	            break; // Exit the loop once the employee is deleted
	        }
	    }

	    if (!found) {
	        System.out.println("Employee not employed here");
	    }
	}
}

