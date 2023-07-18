package _5javaoops;

//example1 
class employee {
	private int emp_id;

	public void setemp_id(int empid) {
		emp_id = empid;

	}

	public int getemp_id() {
		return emp_id;
	}
}

//example2 
class Secret {
	private int data;

	public void setData(int data) {
		if (data >= 100) {
			this.data = data;
		} else {
			System.out.println("You are not allowed");
		}
	}

	public int getData() {
		return data;
	}
}

public class encpsulation {

	public static void main(String[] args) {

		Secret obj = new Secret();
		obj.setData(5);
		obj.setData(895);

		System.out.println(obj.getData());

		employee e1 = new employee();
		e1.setemp_id(122);
		System.out.println(e1.getemp_id());

	}

}
