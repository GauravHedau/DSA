package _6javaoops3PW;

interface MyBank{
	void write();
}

class SBI implements MyBank{
	
	public void write() {
		System.out.println("SBIREAD");
	}
}