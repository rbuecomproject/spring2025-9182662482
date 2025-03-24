package beans;

public class JioSim implements Sim {

	@Override
	public void call() {
	System.out.println("Calling from JioSim");	
	}

	@Override
	public void data() {
		System.out.println("Data from JioSim");
	}

	@Override
	public void sms() {
		System.out.println("SMS from JioSim");
	}
	

	
	
}
