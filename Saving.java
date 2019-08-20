package Session4.Assignment5;

class Saving extends Account {

	private double rateOfInt;

	public Saving(int accNo, String acName, String accBal, double rateOfInt) {
		super(accNo, acName, accBal);
		this.rateOfInt = rateOfInt;

	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}

	void display() {
		System.out.println("Account number: " + getAccNo());
		System.out.println("Account name: " + getAccName());
		System.out.println("Account balance: " + getAccBal());
		System.out.println("Account balance: " + rateOfInt);
	}

}