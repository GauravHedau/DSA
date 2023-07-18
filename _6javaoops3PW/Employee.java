package _6javaoops3PW;

class Employee {
	private int empID = 2;
	private int phone = 90;
	private String name;
	private int basicSal = 20000;
	private int incentive = 200;

	Employee() {
		phone = 899;
		name = "roy";
	}

	Employee(int phoneNo, String empName) {
		phone = phoneNo;
		name = empName;
	}

	private void countSal() {
		System.out.println(basicSal + incentive);
	}

	// getter and setter

	int getphone() {
		return phone;
	}

	String getName() {
		return name;
	}

	void setPhone(int phoneNo) {
		phone = phoneNo;
	}

	void setName(String empName) {
		name = empName;
	}

}