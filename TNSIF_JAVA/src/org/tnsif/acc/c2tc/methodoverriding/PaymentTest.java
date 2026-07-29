package org.tnsif.acc.c2tc.methodoverriding;

class Payment {
	void makePayment() {
		System.out.println("Processing payment using generic method");
	}
}

class UpiPayment extends Payment {
	@Override
	void makePayment() {
		System.out.println("Payment is done using UPI");
	}
}

class CardPayment extends Payment {
	@Override
	void makePayment() {
		System.out.println("Payment made using credit/debit card");
	}
}

class WalletPayment extends Payment {
	@Override
	void makePayment() {
		System.out.println("Payment is done via Wallet");
	}
}

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment; // reference parent class

		payment = new UpiPayment();
		payment.makePayment();

		payment = new CardPayment();
		payment.makePayment();

		payment = new WalletPayment();
		payment.makePayment();

	}

}

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
