package org.tnsif.acc.c2tc.methodoverrding;

class Payment1 {
	void process() {
		System.out.println("Processing payment using Standard Gateway");
	}
}

class Gpay extends Payment1 {
	@Override
	void process() {
		System.out.println("Processing payment via Google pay");

	}

	void CompleteTranscation() {
		super.process();
		process();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		Gpay obj = new Gpay();
		obj.CompleteTranscation();

		// TODO Auto-generated method stub

	}

}
