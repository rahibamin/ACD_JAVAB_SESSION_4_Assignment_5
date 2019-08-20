package Session4.Assignment5;

public class Account {
	private int accNo;
	private String accName;
	private String accBal;

	Account(int accNo, String accName, String accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;

	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBal() {
		return accBal;
	}

	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}

	void display() {
		System.out.println("Account number: " + accNo);
		System.out.println("Account name: " + accName);
		System.out.println("Account balance: " + accBal);
	}
}
