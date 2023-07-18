package _5javaoops;

class BankAccount {
	int otp = 12345;
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int otp, int amount) {
		if (otp == this.otp) {
			this.amount = amount;
		}
	}

}

public class encapculationex {

	public static void main(String[] args) {

		BankAccount obj = new BankAccount();

		obj.setAmount(12345, 21320);
		System.out.println(obj.getAmount());
	}

}
