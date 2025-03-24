package beans;

public class AppMain {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
	//while starting this application I am passing my choice as a args[0]
	Sim sim=(Sim)Class.forName(args[0]).newInstance();	
	//Sim sim1=new JioSim();	
	//while starting this application I am passing my choice
	Phone phone=new Phone(sim);
	//Phone class is loosely coupled with Sim class
	phone.call();
	phone.sms();
	phone.data();
	
	
	
}
}
