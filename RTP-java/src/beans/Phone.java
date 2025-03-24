package beans;

public class Phone {
	Sim sim;
	//any impl object you can pass to this constructor
	public Phone(Sim sim) {
		this.sim = sim;
	}
	
	public void call() {
		sim.call();
	}
	
	public void sms() {
		sim.sms();
	}
	
	public void data() {
		sim.data();
	}
	
	
	

}
