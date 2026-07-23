package org.tnsif.acc.c2tc.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		MaheshDemo obj = new Ramesh(); // original cls name is mahesh with the help of original clas have to create obj
		obj.calling();
		obj.aiIntegration();
		obj.satelliteComm();
		obj.HealthMonitoring();

	}

}
abstract class MaheshDemo {
	void calling() {
		System.out.println("Phone is having calling feature");
	}
	abstract void aiIntegration();

	abstract void satelliteComm();

	abstract void HealthMonitoring();
}

abstract class Suresh extends MaheshDemo {

@Override
void aiIntegration() {
		System.out.println("Phone is integrated with AIIntegration");
		// TODO Auto-generated method stub

	}

	@Override
	abstract void satelliteComm();
		// TODO Auto-generated method stub
	@Override
	abstract void HealthMonitoring();
	// TODO Auto-generated method stub
}
	class Ramesh extends Suresh {

		@Override
		void satelliteComm() {
			System.out.println("Phone is integrated with satellite");
		}
			// TODO Auto-generated method stub
	@Override
	void HealthMonitoring() {
		System.out.println("Phone is integrated with healthmonitoring");
		// TODO Auto-generated method stub
	}
}
