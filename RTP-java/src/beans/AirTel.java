package beans;

public class AirTel implements Sim {

	@Override
	public void call() {
		System.out.println("Calling from AirTel");			
	}

	@Override
	public void sms() {
		System.out.println("SMS from AirTel");		
		
	}

	@Override
	public void data() {
		System.out.println("Data from AirTel");		
		
	}

}
