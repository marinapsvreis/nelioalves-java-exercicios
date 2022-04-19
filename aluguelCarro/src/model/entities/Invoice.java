package model.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;

	public Invoice(double basicPayment, double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public double getBasicPayment() {
		return basicPayment;
	}

	public double getTax() {
		return tax;
	}

	public double getTotalPayment() {
		return basicPayment + tax;
	}
}
